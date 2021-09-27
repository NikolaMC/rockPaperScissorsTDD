package com.example.rockPaperScissorsTDD;

import java.util.Random;

public class RandomGenerator {
    Random rand = new Random();

    public int getRandom() {
        return rand.nextInt(3);
    }
}
