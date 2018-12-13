package com.evolution.of.trust;

public class Player {

    private String name;
    private int score;
    private int currentInput;
    private Player opponent;
    private PlayerBehaviour behaviour;

    public Player(String name, int score, PlayerBehaviour behaviour) {
        this.name = name;
        this.score = score;
        this.behaviour = behaviour;
    }

    public void setCurrentInput(int currentInput) {
        this.currentInput = currentInput;
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
        this.setCurrentInput(this.behaviour.getInputFromUser(getOpponent()));
    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    public Player getOpponent() {
        return this.opponent;
    }
}
