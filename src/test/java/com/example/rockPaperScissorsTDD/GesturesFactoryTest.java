package com.example.rockPaperScissorsTDD;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class GesturesFactoryTest {

    GesturesFactory gesturesFactory = new GesturesFactory();

    @ParameterizedTest
    @ValueSource(strings = {"ROCK", "PAPER", "SCISSORS"})
    void test_factory_returns_gesture_success(String gesture) {
        assertNotNull(gesturesFactory.getGesture(gesture));
    }

    @Test
    void test_factory_returns_rock_success() {
        assertTrue(gesturesFactory.getGesture("ROCK") instanceof Rock);
    }

    @Test
    void test_factory_returns_paper_success() {
        assertTrue(gesturesFactory.getGesture("PAPER") instanceof Paper);
    }

    @Test
    void test_factory_returns_scissors_success() {
        assertTrue(gesturesFactory.getGesture("SCISSORS") instanceof Scissors);
    }

    @Test
    void test_factory_returns_gesture_fail() {
        assertNull(gesturesFactory.getGesture("asd"));
    }

}
