package com.evolution.of.trust;

import jdk.internal.util.xml.impl.Input;

public class GameManger {

    public static int NO_OF_ROUNDS = 5;
    public static final int NO_OF_PLAYERS = 2;

    InputReader inputReader = new ConsoleInputReader();
    OutputWriter outputWriter = new ConsoleOutputWriter();

    Player player1 = new Player("A", 0);
    Player player2 = new Player("B", 0);
    Player currentPlayer;

    ScoreCalculator scoreCalculator = new ScoreCalculator();
    Winner winner = new Winner();


    public void startGame() {
        outputWriter.displayGameInfo();
        while(NO_OF_ROUNDS > 0) {
            switchPlayer();

            scoreCalculator.compareInputAndUpdate(player1, player2);
            outputWriter.displayCurrentScore(player1, player2);
            NO_OF_ROUNDS -= 1;
        }

    }

    private void switchPlayer() {
        int turns = NO_OF_PLAYERS;
        currentPlayer = player1;

        while(turns > 0) {
            currentPlayer.setCurrentInput(inputReader.getInputFromUser());
            currentPlayer = player2;
            turns--;
        }
    }

    public static void main(String[] args){
        GameManger gm = new GameManger();
        gm.startGame();

    }

}
