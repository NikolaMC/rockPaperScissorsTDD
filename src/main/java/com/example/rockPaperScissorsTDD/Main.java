package com.example.rockPaperScissorsTDD;

public class Main {

    public static void main(String[] args) {

        Game game = new Game(new GameCounter());
        game.startGame();
    }
}
