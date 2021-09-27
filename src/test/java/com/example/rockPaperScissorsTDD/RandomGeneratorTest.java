package com.example.rockPaperScissorsTDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomGeneratorTest {

    @Test
    void name() {
        assertEquals(2, RandomGenerator.getNumber());
    }
}