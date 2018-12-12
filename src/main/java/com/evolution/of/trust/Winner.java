package com.evolution.of.trust;

public class Winner {

    public void declareWinner(Player player1, Player player2, OutputWriter outputWriter) {
        if (player1.getScore() == player2.getScore())
            outputWriter.declareTieMessage();
        else if (player1.getScore() < player2.getScore()) {
            outputWriter.declareWinner(player2);
        } else {
            outputWriter.declareWinner(player1);
        }
    }
}
