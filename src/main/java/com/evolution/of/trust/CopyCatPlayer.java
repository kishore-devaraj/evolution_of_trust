package com.evolution.of.trust;

public class CopyCatPlayer implements PlayerBehaviour {
    public int getInputFromUser() {
        return GameManger.previousPlayerInput;
    }
}
