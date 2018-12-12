package com.evolution.of.trust;

public class ConsolePlayer implements PlayerBehaviour {
    ConsoleInputReader inputReader = new ConsoleInputReader();
    public int getInputFromUser () {
       return inputReader.getInputFromUser();
    }
}
