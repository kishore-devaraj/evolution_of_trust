package com.evolution.of.trust;

public interface OutputWriter {
    public void declareWinner(Player player);
    public void displayCurrentScore(Player player1,Player player2);
    public void displayGameInfo();
    public void declareTieMessage();
}
