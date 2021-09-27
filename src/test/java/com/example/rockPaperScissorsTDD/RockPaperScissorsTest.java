package com.example.rockPaperScissorsTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RockPaperScissorsTest {

    Rock rock;
    Paper paper;
    Scissors scissors;

    @BeforeEach
    void setUp() {
        rock = new Rock();
        paper = new Paper();
        scissors = new Scissors();
    }

    @Test
    void rock_beats_scissors_success() {
        assertTrue(rock.beats(scissors));
    }
}
