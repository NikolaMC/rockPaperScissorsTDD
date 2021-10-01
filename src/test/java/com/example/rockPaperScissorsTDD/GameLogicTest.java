package com.example.rockPaperScissorsTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class GameLogicTest {

    private Player player;
    private Player cpu;
    private Game game;
    private GameCounter counter;
    private RandomGenerator generator;

    @BeforeEach
    void setUp() {
        player = new Player("spelaren");
        cpu = new Player("cpu");
        counter = mock(GameCounter.class);
        generator = mock(RandomGenerator.class);
        game = new Game(counter, generator);

    }

    @Test
    void test_Game_gameLogic_hardcoded_player_victory() {
        // Given
        String playerChoice = "ROCK";
        System.out.println("You have chosen the name " + player.getName());

        // When
        game.gameLogic(player, cpu, playerChoice, "SCISSORS");

        // Then
        assertEquals("ROCK", playerChoice);

        verify(counter, times(1)).playerWon();
        verify(counter, times(0)).computerWon();

    }
}
/*
    TODO
        mocka randomGenerator och bestäm cpu input
        mocka input och output ( InputStream, OutputStream )
*/