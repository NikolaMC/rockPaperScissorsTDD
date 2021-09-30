package com.example.rockPaperScissorsTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RockPaperScissorsTest {

    Rock rock;
    Paper paper;
    Scissors scissors;
    GameCounter counter;
    Gestures rock1;
    Gestures scissors1;
    Gestures paper1;

    @BeforeEach
    void setUp() {
        rock = new Rock();
        paper = new Paper();
        scissors = new Scissors();
        counter = new GameCounter();
        rock1 = new Rock();
        scissors1 = new Scissors();
        paper1 = new Paper();
    }

    // Rock tests

    @Test
    void rock_beats_scissors_success() {
        assertTrue(rock.beats(scissors));
    }

    @Test
    void rock_beats_paper_fail() {
        assertFalse(rock.beats(paper));
    }

    @Test
    void rock_beats_rock_fail() {
        assertFalse(rock.beats(rock));
    }

    // Paper tests

    @Test
    void paper_beats_scissors_fail() {
        assertFalse(paper.beats(scissors));
    }

    @Test
    void paper_beats_paper_fail() {
        assertFalse(paper.beats(paper));
    }

    @Test
    void paper_beats_rock_success() {
        assertTrue(paper.beats(rock));
    }

    // Scissors tests

    @Test
    void scissors_beats_scissors_fail() {
        assertFalse(scissors.beats(scissors));
    }

    @Test
    void scissors_beats_paper_success() {
        assertTrue(scissors.beats(paper));
    }

    @Test
    void scissors_beats_rock_fail() {
        assertFalse(scissors.beats(rock));
    }

    // Gestures isBeatenBy
    @Test
    void test_gestures_isBeatenBy_true() {
        assertTrue(rock1.isBeatenBy(paper1));
        assertTrue(paper1.isBeatenBy(scissors1));
        assertTrue(scissors1.isBeatenBy(rock1));
    }
    @Test
    void test_gestures_isBeatenBy_false() {
        assertFalse(rock1.isBeatenBy(scissors1));
        assertFalse(paper1.isBeatenBy(rock1));
        assertFalse(scissors1.isBeatenBy(paper1));
    }
}
