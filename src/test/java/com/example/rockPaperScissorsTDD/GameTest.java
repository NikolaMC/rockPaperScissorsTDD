package com.example.rockPaperScissorsTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GameTest {

    Rock rock;
    Paper paper;
    Scissors scissors;
    Player player;
    Player cpu;
    Game game;

    @BeforeEach
    void setUp() {
        rock = new Rock();
        paper = new Paper();
        scissors = new Scissors();
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
/*
    @Test
    void name() {
        RandomMove randomMove = mock(RandomMove.class);
        when(randomMove.randomMove()).thenReturn("scissors");
        Game game = new Game(randomMove, "arne");

        game.throwGesture("rock");

        assertEquals(1, game.getPlayerScore());
        assertEquals(0, game.getComputerScore());
    }

 */
//
//    @Test
//    void name1() {
//        GameControllerStatus gameControllerStatus = GameControllerStatus.MAKE_MOVE;
//        GameController gameController = new GameController(gameControllerStatus);
//
//        gameController.playerInput("rock");
//
//        assertEquals(GameControllerStatus.MAKE_MOVE, gameController.getStatus());
//        assertEquals(1, game.getPlayerScore());
//        assertEquals(0, game.getComputerScore());
//    }
//
//    @Test
//    void name2() {
//        GameControllerStatus gameControllerStatus = GameControllerStatus.ENTER_NAME;
//        GameController gameController = new GameController(gameControllerStatus);
//
//        gameController.playerInput("arne");
//
//        assertEquals(GameControllerStatus.MAKE_MOVE, gameController.getStatus());
//    }
//
//    @Test
//    void name3() {
//        GameControllerStatus gameControllerStatus = GameControllerStatus.MAKE_MOVE;
//        GameController gameController = new GameController(gameControllerStatus);
//
//        gameController.playerInput("rock");
//        gameController.playerInput("rock");
//        gameController.playerInput("rock");
//
//        assertEquals(GameControllerStatus.GAME_ENDED, gameController.getStatus());
//        assertEquals(3, game.getPlayerScore());
//        assertEquals(0, game.getComputerScore());
//    }

}