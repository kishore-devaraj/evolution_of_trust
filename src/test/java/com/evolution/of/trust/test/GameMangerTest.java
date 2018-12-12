package com.evolution.of.trust.test;

import com.evolution.of.trust.GameManger;
import com.evolution.of.trust.InputReader;
import com.evolution.of.trust.OutputWriter;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class GameMangerTest {

    @Test
    public void startGameTest() {
        GameManger gm = new GameManger();
        InputReader inputReader = mock(InputReader.class);

        when(inputReader.getInputFromUser()).thenReturn(0);
        gm.startGame();

    }
}
