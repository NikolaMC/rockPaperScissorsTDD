package com.example.rockPaperScissorsTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RandomGeneratorTest {

    RandomGenerator generator;

    @BeforeEach
    void setUp() {
        generator = mock(RandomGenerator.class);
    }

    @Test
    void test_cpuChoice_scissors_success() {

        when(generator.cpuChoice()).thenReturn("SCISSORS");
        assertEquals("SCISSORS", generator.cpuChoice());
    }
}