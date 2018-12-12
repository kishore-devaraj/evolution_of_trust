package com.evolution.of.trust;

import java.util.HashMap;
import java.util.Map;

public class ScoreCalculator {

    public static final int COOPERATE_AND_COOPERATE_POINT = 2;
    public static final int CHEAT_AND_CHEAT_POINT = 0;
    public static final int CHEAT_POINT = 3;
    public static final int CORPORATE_POINT = -1;


    public void calc(Player player, int scoreToBeAdded) {
        player.addScore(scoreToBeAdded);
    }


    public void compareInputAndUpdate(Player player1, Player player2) {
        if((player1.getCurrentInput() == 1)
                && (player2.getCurrentInput() == 1)) {
             calc(player1, COOPERATE_AND_COOPERATE_POINT);
             calc(player2, COOPERATE_AND_COOPERATE_POINT);
        } else if((player1.getCurrentInput() == 0)
                && (player2.getCurrentInput() == 0)) {
            calc(player1, CHEAT_AND_CHEAT_POINT);
            calc(player2, CHEAT_AND_CHEAT_POINT);
        } else if((player1.getCurrentInput() == 0)
                && (player2.getCurrentInput() == 1)) {
            calc(player1, CHEAT_POINT);
            calc(player2, CORPORATE_POINT);
        } else if((player1.getCurrentInput() == 1)
                && (player2.getCurrentInput() == 0)) {
            calc(player1, CORPORATE_POINT);
            calc(player2, CHEAT_POINT);
        }
    }


}
