package com.evolution.of.trust;

import java.util.ArrayList;
import java.util.List;

public class Player implements Subject, Observer {

    private String name;
    private int score;
    private int currentInput;
    private PlayerBehaviour behaviour;
    private List<Player> listOfObservers;
    private Player opponent;
    private int opponentInput;

    public Player(String name, int score, PlayerBehaviour behaviour) {
        this.name = name;
        this.score = score;
        this.behaviour = behaviour;
        listOfObservers = new ArrayList<Player>();
    }

    public void setCurrentInput(int currentInput) {
        this.currentInput = currentInput;
        notifyObservers();
    }

    public int getCurrentInput() {
        return currentInput;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int scoreToBeAdded) {
        score += scoreToBeAdded;
    }

    public void play() {
        this.setCurrentInput(this.behaviour.getInputFromUser());
    }


    // Methods for Subject
    public void subscribe (Player observer) {
        if(observer == null) return;
        if(!(listOfObservers.contains(observer))) {
            listOfObservers.add(observer);
        }
    }

    public void notifyObservers () {
        for(Player player : listOfObservers) {
            player.update(this.getCurrentInput());
        }
    }


    // Methods to be Observers
    public void setPlayer (Player opponent) {
        this.opponent = opponent;
        this.opponent.subscribe(this);
    }

    public void update(int currentInputValue) {
        this.behaviour.setOpponentInput(currentInputValue);
    }

}
