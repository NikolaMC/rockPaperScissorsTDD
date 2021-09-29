package com.example.rockPaperScissorsTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {

    Rock rock;
    Paper paper;
    Scissors scissors;
    Player player;
    Player cpu;

    @BeforeEach
    void setUp() {
        rock = new Rock();
        paper = new Paper();
        scissors = new Scissors();
        player = new Player("player1");
        cpu = new Player("cpu");
    }

    @Test
    void player1_wins_with_rock_vs_cpu_scissors() {
        // To be continued
    }

//    @Test
//    void name() {
//        RandomMove randomMove = mock(RandomMove.class);
//        when(randomMove.randomMove()).thenReturn("scissors");
//        Game game = new Game(randomMove, "arne");
//
//        game.throwGesture("rock");
//
//        assertEquals(1, game.getPlayerScore());
//        assertEquals(0, game.getComputerScore());
//    }
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