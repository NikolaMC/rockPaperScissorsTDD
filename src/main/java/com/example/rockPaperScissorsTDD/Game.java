package com.example.rockPaperScissorsTDD;

import java.util.Scanner;

public class Game {
    private GameCounter counter;
    RandomGenerator generator = new RandomGenerator();

    public Game() {
    }

    public Game(GameCounter counter) {
        this.counter = counter;
    }

    public Game(GameCounter counter, RandomGenerator generator) {
        this.counter = counter;
        this.generator = generator;
    }

    public void startGame() {
        System.out.println("Please enter your name to start the game!");
        Scanner playerScanner = new Scanner(System.in);

        String name = playerScanner.nextLine();
        Player player = new Player(name);
        Player cpu = new Player("Cpu");

        System.out.println("You have chosen the name " + player.getName());
        System.out.println("The game begins now.\nChoose between ROCK, PAPER and SCISSOR");

        while (isGameLoop(player, cpu)) {

            String playerChoice = playerScanner.nextLine().toUpperCase();
            String cpuChoice = generator.cpuChoice();

            if (!playerChoice.equals("ROCK") && !playerChoice.equals("PAPER") && !playerChoice.equals("SCISSORS")) {
                System.out.println("Invalid gesture");
            } else {
                gameLogic(player, cpu, playerChoice, cpuChoice);
            }
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

    public void gameLogic(Player player, Player cpu, String playerChoice, String cpuChoice) {

        System.out.println(player.getName() + " choice is: " + playerChoice);
        System.out.println("CPU choice is: " + cpuChoice);
        if (playerChoice.equals(cpuChoice)) {
            System.out.println("It's a tie!");
        } else if (cpu.throwGesture(cpuChoice).isBeatenBy(player.throwGesture(playerChoice))) {
            counter.playerWon();
            System.out.println(player.getName() + " won this round!");
        } else if (player.throwGesture(playerChoice).isBeatenBy(cpu.throwGesture(cpuChoice))) {
            counter.computerWon();
            System.out.println(cpu.getName() + " won this round!");
        } else {
            System.out.println("What did you do? This was NOT supposed to happen");
        }
    }


}
