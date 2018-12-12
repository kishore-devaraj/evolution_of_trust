package com.evolution.of.trust.test;

import com.evolution.of.trust.CrimePlayer;
import com.evolution.of.trust.Player;
import com.evolution.of.trust.ScoreCalculator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class ScoreCalculatorTest {
    ScoreCalculator scoreCalculator = new ScoreCalculator();


    @Test
    public void calcIndividualScore () {
        Player player1 = new Player("A", 0, new CrimePlayer());
        Player player2 = new Player("B",  0, new CrimePlayer());
        scoreCalculator.calc(player1, 2);
        Assert.assertEquals(2, player1.getScore());
    }

    @Test
    public void compareInputsAndUpdateScore () {
        Player player1 = new Player("A", 0, new CrimePlayer());
        Player player2 = new Player("B",  0, new CrimePlayer());
        player1.setCurrentInput(1);
        player2.setCurrentInput(1);
        scoreCalculator.compareInputAndUpdate(player1, player2);
        Assert.assertEquals(2, player1.getScore());
        Assert.assertEquals(2, player2.getScore());

        player1.setCurrentInput(0);
        player2.setCurrentInput(0);
        scoreCalculator.compareInputAndUpdate(player1, player2);
        Assert.assertEquals(2, player1.getScore());
        Assert.assertEquals(2, player2.getScore());

        player1.setCurrentInput(0);
        player2.setCurrentInput(1);
        scoreCalculator.compareInputAndUpdate(player1, player2);
        Assert.assertEquals(5, player1.getScore());
        Assert.assertEquals(1, player2.getScore());

        player1.setCurrentInput(1);
        player2.setCurrentInput(0);
        scoreCalculator.compareInputAndUpdate(player1, player2);
        Assert.assertEquals(4, player1.getScore());
        Assert.assertEquals(4, player2.getScore());

    }
}
