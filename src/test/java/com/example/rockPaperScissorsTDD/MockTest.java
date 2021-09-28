package com.example.rockPaperScissorsTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.mockito.ArgumentMatchers.eq;
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
    void name() {

        //Given
        doCallRealMethod().when(game).gameLogic(player,cpu,"PAPER");

        //When



        //then
        //verify

    }

    @Test
    void test() {

      //  assertTrue(rock.beats(paper));
        when(eq(rock.beats(paper))).thenReturn(false);


    }
}
