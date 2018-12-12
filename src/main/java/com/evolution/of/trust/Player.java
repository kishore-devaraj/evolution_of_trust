package com.evolution.of.trust;

public class Player {

    private String name;
    private int score;
    private int currentInput;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getCurrentInput() {
        return currentInput;
    }

    public void addScore(int scoreToBeAdded) {
        score += scoreToBeAdded;
    }

    public int getScore() {
        return score;
    }

    public void setCurrentInput(int currentInput) {
        this.currentInput = currentInput;
    }

    public String getName() {
        return name;
    }

    public void setScore (int score) {
        this.score = score;
    }
}
