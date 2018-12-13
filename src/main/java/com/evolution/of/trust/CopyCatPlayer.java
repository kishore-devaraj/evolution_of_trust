package com.evolution.of.trust;

public class CopyCatPlayer implements PlayerBehaviour {
    private Player opponent;
    private int opponentInput;

    public int getInputFromUser () {
        return opponentInput;
    }
    public void setOpponentInput (int currentInputValue) {
        this.opponentInput = currentInputValue;
    }
}
