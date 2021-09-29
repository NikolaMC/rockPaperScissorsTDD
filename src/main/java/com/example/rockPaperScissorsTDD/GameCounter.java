package com.example.rockPaperScissorsTDD;

public class GameCounter {
    private int playerPoints = 0;
    private int computerPoints = 0;

    public int getPlayerPoints() {
        return playerPoints;
    }

    public int getComputerPoints() {
        return computerPoints;
    }

    public void playerWon() {
        if (playerPoints < 4) {
            playerPoints++;
        }
    }

    public void computerWon() {
        if (computerPoints < 4) {
            computerPoints++;
        }
    }
}
