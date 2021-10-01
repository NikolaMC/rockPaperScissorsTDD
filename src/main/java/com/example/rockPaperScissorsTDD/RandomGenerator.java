package com.example.rockPaperScissorsTDD;

import java.util.Random;

public class RandomGenerator {
    Random rand = new Random();

    private int getRandom() {
        return rand.nextInt(3);
    }
    public String cpuChoice() {

        int choice = getRandom();
        switch (choice) {
            case 0:
                return "ROCK";

            case 1:
                return "SCISSORS";

            default:
                return "PAPER";

        }
    }
}
