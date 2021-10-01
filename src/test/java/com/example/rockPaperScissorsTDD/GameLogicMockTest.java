package com.example.rockPaperScissorsTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GameLogicMockTest {

    Player player;
    Player cpu;
    Game game;

    @BeforeEach
    void setUp() {

        player = new Player("player");
        cpu = new Player("cpu");
        game = mock(Game.class);

    }

    @Test
    void test_call_on_real_method_gameLogic() {
        //  Given
        doCallRealMethod().when(game).gameLogic(player, cpu, "PAPER", "ROCK");

    }
}
