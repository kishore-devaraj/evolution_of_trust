package com.evolution.of.trust;

import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    Scanner scanner = new Scanner(System.in);
    public int getInputFromUser() {
        return scanner.nextInt();
    }
}

