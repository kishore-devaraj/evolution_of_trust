package com.evolution.of.trust.test;

import com.evolution.of.trust.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;


@RunWith(MockitoJUnitRunner.class)
public class WinnerTest {

    @Mock
    OutputWriter outputWriter;
    @Test
    public void declareWinnerTest() {
        Player player1 = new Player("A", 30, new CrimePlayer());
        Player player2 = new Player("B", 20, new CrimePlayer());
        Winner winner = new Winner();

        winner.declareWinner(player1, player2, outputWriter);
        verify(outputWriter).declareWinner(player1);

    }


    @Test
    public void declareTieTest () {
        Player player1 = new Player("A", 20, new CrimePlayer());
        Player player2 = new Player("B", 20, new CrimePlayer());
        Winner winner = new Winner();

        winner.declareWinner(player1, player2, outputWriter);
        verify(outputWriter).declareTieMessage();
    }
}
