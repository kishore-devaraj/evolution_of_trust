package com.evolution.of.trust.test;

import com.evolution.of.trust.GameManger;
import com.evolution.of.trust.InputReader;

import static org.mockito.Mockito.mock;


public class GameMangerTest {


    public void startGameTest(){
        GameManger gm = new GameManger();
        InputReader ir= mock(InputReader.class);
        when(ir.getInputFromUser())
        gm.startGame();

    }
}
