package com.example.rockPaperScissorsTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameLogicTest {

    private  Player player;
    private  Player cpu;
    private  Game game;
    private GameCounter counter;

    @BeforeEach
    void setUp() {
        player = new Player("player1");
        cpu = new Player("cpu");
        game = new Game();
        counter = new GameCounter();
    }

    @Test
    void test_Game_gameLogic_hardcoded_player_victory() {
        // Given
        player = new Player("spelaren");
        String playerChoice = "ROCK";
        System.out.println("You have chosen the name " + player.getName());

        // When
        game.gameLogic(player, cpu, playerChoice, "SCISSORS");
        counter.playerWon();

        // Then
        assertEquals("ROCK", playerChoice);
        assertEquals(1, counter.getPlayerPoints());
        assertEquals(0, counter.getComputerPoints());

    }
}