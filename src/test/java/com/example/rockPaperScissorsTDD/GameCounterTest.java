package com.example.rockPaperScissorsTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameCounterTest {

    GameCounter gameCounter;

    @BeforeEach
    void setUp() {
        gameCounter = new GameCounter();

    }

    @Test
    void cpu_get_point() {
        gameCounter.computerWon();
        assertEquals(1,gameCounter.getComputerPoints());
    }
    @Test
    void player_get_point() {
        gameCounter.playerWon();
        assertEquals(1,gameCounter.getPlayerPoints());
    }
}
