package com.example.rockPaperScissorsTDD;

import java.util.Scanner;

public class Game {
    private GesturesFactory gesturesFactory = new GesturesFactory();
    private final GameCounter counter = new GameCounter();

    public Game() { }

    public void startGame() {
        System.out.println("Please enter your name");
        Scanner playerScanner = new Scanner(System.in);

        String name = playerScanner.nextLine();
        Player player = new Player(name);
        Player cpu = new Player("Cpu");

        System.out.println("You have chosen the name " + player.getName());
        System.out.println("The game begins now.\nChoose between ROCK, PAPER and SCISSOR");

        while (isGameLoop(player, cpu)) {
            String playerChoice = playerScanner.nextLine().toUpperCase();

            gameLogic(player, cpu, playerChoice);
        }
    }

    private boolean isGameLoop(Player player, Player cpu) {

        System.out.println(player.getName() + " score: " + counter.getPlayerPoints());
        System.out.println(cpu.getName() + " score: " + counter.getComputerPoints());

        if (counter.getPlayerPoints() == 3) {
            System.out.println(player.getName() + " wins!");
            return false;
        }

        if (counter.getComputerPoints() == 3) {
            System.out.println(cpu.getName() + " wins!");
            return false;
        }

        return true;
    }

    public void gameLogic(Player player, Player cpu, String playerChoice) {
        String cpuChoice = cpuChoice();
        System.out.println("CPU chose: " + cpuChoice);

        if (player.throwGesture(playerChoice).beats(cpu.throwGesture(cpuChoice))) {
            counter.playerWon();
        } else if (cpu.throwGesture(cpuChoice).beats(player.throwGesture(playerChoice))) {
            counter.computerWon();
        } else {
            System.out.println("It's a tie!");
        }

    }

    private String cpuChoice() {
        RandomGenerator randomGenerator = new RandomGenerator();
        int choice = randomGenerator.getRandom();
        switch (choice) {
            case 0:
                return "ROCK";

            case 1:
                return "SCISSORS";

            default:
                return "PAPER";

        }
    }
}
