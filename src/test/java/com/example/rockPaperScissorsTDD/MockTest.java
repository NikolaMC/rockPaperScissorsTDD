package com.example.rockPaperScissorsTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MockTest {

    Rock rock;
    Paper paper;
    Scissors scissors;
    Player player;
    Player cpu;
    Game game;
    Gestures gestures;

    @BeforeEach
    void setUp() {
        rock = mock(Rock.class);
        paper = mock(Paper.class);
        scissors = mock(Scissors.class);
        player = new Player("player");
        cpu = new Player("cpu");
        game = mock(Game.class);
        gestures = mock(Gestures.class);
    }

    @Test
    void test_call_on_real_method() {

        //Given
        doCallRealMethod().when(game).gameLogic(player, cpu, "PAPER");

        //When

        //then
        //verify

    }

    @Test
    void test_rock_lose_against_paper() {
        when(rock.beats(paper)).thenReturn(false);
        assertFalse(rock.beats(paper));
    }

    @Test
    void test_rock_wins_against_scissors() {
        when(rock.beats(scissors)).thenReturn(true);
        assertTrue(rock.beats(scissors));
    }
    @Test
    void test_rock_draw_against_rock() {
        when(rock.beats(rock)).thenReturn(false);
        assertFalse(rock.beats(rock));
    }
}
