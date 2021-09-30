package com.example.rockPaperScissorsTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameLogicTest {

    private  Player player;
    private  Player cpu;
    private  Game game;

    @BeforeEach
    void setUp() {
        player = new Player("player1");
        cpu = new Player("cpu");
        game = new Game();
    }

    @Test
    void test_Game_gameLogic_hardcoded_player_victory() {

        player = new Player("spelaren");

        System.out.println("You have chosen the name " + player.getName());

        game.gameLogic(player, cpu, "ROCK", "SCISSORS");

    }


}