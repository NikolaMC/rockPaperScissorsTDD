package com.example.rockPaperScissorsTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

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
    GesturesFactory gesturesFactory;
    GameCounter counter;

    @BeforeEach
    void setUp() {
        rock = mock(Rock.class);
        paper = mock(Paper.class);
        scissors = mock(Scissors.class);
        player = new Player("player");
        cpu = new Player("cpu");
        game = new Game();
        gestures = mock(Gestures.class);
        gesturesFactory = mock(GesturesFactory.class);
        counter = new GameCounter();
    }

    @Test
    void name() {

    }

   /* @Test
    void test_call_on_real_method() {

        //Given
       // doCallRealMethod().when(game).gameLogic(player, cpu, "PAPER", "ROCK");

        //When
        // game.gameLogic(player, cpu, "PAPER", "ROCK");
        //then

        // verify
       // verify(game, times(1)).gameLogic(player, cpu, "PAPER", "ROCK");
    }

        //verify
        verify(game, times(1)).gameLogic(player, cpu, "PAPER", "ROCK");
    }*/


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
/*
    println är bara till för demonstrativt syfte, de flesta åtkomsterna till dessa sker i loopen i startGame() vilket vi ej hoppar in i här.
 */
    @Test
    void test_Game_gameLogic_hardcoded_player_victory() {

        player = new Player("spelaren");

        System.out.println("You have chosen the name " + player.getName());

        game.gameLogic(player,cpu,"ROCK", "SCISSORS");

    }

    @Test
    void test_Game_gameLogic_interactive_player_win_with_choice_rock() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");

        String name = scanner.nextLine();
        player = new Player(name);
        System.out.println("You have chosen the name " + player.getName());
        System.out.println("The game begins now.\nChoose between ROCK, PAPER and SCISSOR");
        String playerChoice = scanner.nextLine().toUpperCase();
        game.gameLogic(player, cpu, playerChoice, "SCISSORS");


    }
}
