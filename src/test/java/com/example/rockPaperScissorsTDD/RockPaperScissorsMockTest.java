package com.example.rockPaperScissorsTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RockPaperScissorsMockTest {

    Rock rock;
    Paper paper;
    Scissors scissors;

    @BeforeEach
    void setUp() {
        rock = mock(Rock.class);
        paper = mock(Paper.class);
        scissors = mock(Scissors.class);
    }

    @Test
    void test_rock_lose_against_paper() {
        when(rock.beats(paper)).thenReturn(false);
        assertFalse(rock.beats(paper));
    }

    @Test
    void test_rock_wins_against_scissors_() {
        when(rock.beats(scissors)).thenReturn(true);
        assertTrue(rock.beats(scissors));
    }

    @Test
    void test_rock_draw_against_rock() {
        when(rock.beats(rock)).thenReturn(false);
        assertFalse(rock.beats(rock));
    }

    @Test
    void test_rock_wins_against_scissors_isBeatenBy() {
        when(rock.isBeatenBy(scissors)).thenReturn(false);
        assertFalse(rock.isBeatenBy(scissors));
    }
}
