package com.evolution.of.trust;

public class ConsoleOutputWriter implements OutputWriter {
    public void declareWinner(Player player) {
        System.out.println(player.getName() + " is a Winner.");
    }

    public void declareTieMessage () {
        System.out.println("Game TIED");
    }

    public void displayCurrentScore(Player player1, Player player2) {
        System.out.println("Player 1: " + player1.getScore());
        System.out.println("Player 2: " + player2.getScore());
    }

    public void displayGameInfo() {
        System.out.println("Cheat: 0, Corporate: 1");
    }
}
