package com.example.rockPaperScissorsTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomGeneratorTest {

    RandomGenerator generator;

    @BeforeEach
    void setUp() {
        generator = new RandomGenerator();
    }

    @Test
    void test_random_number_success() {
        int min = 0;
        int max = 2;
        int randNum = generator.getRandom();
        System.out.println(randNum);
        assertTrue(randNum <= max);
        assertTrue(randNum >= min);
    }
}