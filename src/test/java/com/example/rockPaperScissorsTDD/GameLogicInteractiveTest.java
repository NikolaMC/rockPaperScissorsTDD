package com.example.rockPaperScissorsTDD;

import java.util.Scanner;

public class GameLogicInteractiveTest {

    public static void main(String[] args) {
        test_Game_gameLogic_interactive_player_win_with_choice_rock();
    }

    private static void test_Game_gameLogic_interactive_player_win_with_choice_rock() {
         Player cpu = new Player("cpu");
         Game game = new Game();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");

        String name = scanner.nextLine();
        Player player = new Player(name);

        System.out.println("You have chosen the name " + player.getName());
        System.out.println("The game begins now.\nChoose between ROCK, PAPER and SCISSOR");

        String playerChoice = scanner.nextLine().toUpperCase();
        game.gameLogic(player, cpu, playerChoice, "SCISSORS");

    }
}
