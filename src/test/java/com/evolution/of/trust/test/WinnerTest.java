package com.evolution.of.trust.test;

import com.evolution.of.trust.ConsoleOutputWriter;
import com.evolution.of.trust.OutputWriter;
import com.evolution.of.trust.Player;
import com.evolution.of.trust.Winner;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static javafx.beans.binding.Bindings.when;
import static org.mockito.Mockito.mock;

public class WinnerTest {

    @Test
    public void declareWinnerTest() {
        Player player1 = new Player("A", 10);
        Player player2 = new Player("B", 20);
        Winner winner = new Winner();

        OutputWriter outputWriter = new ConsoleOutputWriter();
        winner.declareWinner(player1, player2, outputWriter);

        player1.setScore(10);
        player2.setScore(10);
        winner.declareWinner(player1, player2, outputWriter);

    }
}
