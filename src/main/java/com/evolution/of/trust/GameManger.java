package com.evolution.of.trust;

import jdk.internal.util.xml.impl.Input;

public class GameManger {

    public static int NO_OF_ROUNDS = 5;

    InputReader inputReader = new ConsoleInputReader();
    OutputWriter outputWriter = new ConsoleOutputWriter();

    Player player1 = new Player("A", 0, new ConsolePlayer());
    Player player2 = new Player("B", 0, new CopyCatPlayer());

    ScoreCalculator scoreCalculator = new ScoreCalculator();
    Winner winner = new Winner();

    public void startGame() {
        player2.setPlayer(player1);

        outputWriter.displayGameInfo();
        while(NO_OF_ROUNDS > 0) {
              player1.play();
              player2.play();

            scoreCalculator.compareInputAndUpdate(player1, player2);
            outputWriter.displayCurrentScore(player1, player2);
            NO_OF_ROUNDS -= 1;
        }
        winner.declareWinner(player1, player2, outputWriter);
    }


    public static void main(String[] args){
        GameManger gm = new GameManger();
        gm.startGame();

    }

}
