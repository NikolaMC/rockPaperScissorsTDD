package com.example.rockPaperScissorsTDD;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private final Rock rock = new Rock();
    private final Scissors scissors = new Scissors();
    private final Paper paper = new Paper();
    private GesturesFactory gesturesFactory = new GesturesFactory();
    private GameCounter counter = new GameCounter();

    public Game() {
    }

    public void startGame() {
        System.out.println("Please enter your name");
        Scanner playerScanner = new Scanner(System.in);

        String name = playerScanner.nextLine();
        Player player = new Player(name);
        Player cpu = new Player("Cpu");

        System.out.println("You have chosen the name " + player.getName());
        System.out.println("The game begins now.\nChoose between ROCK, PAPER and SCISSOR");
        boolean gameLoop = true;
        while (gameLoop) {
            String playerChoice = playerScanner.nextLine().toUpperCase();

            gameLogic(player, cpu, playerChoice);

            if (counter.getPlayerPoints() == 3){
                gameLoop = false;
                System.out.println(player.getName() + " wins!");
            }
            if (counter.getComputerPoints() == 3){
                gameLoop = false;
                System.out.println(cpu.getName() + " wins!");
            }
        }
    }

    private void gameLogic(Player player, Player cpu, String playerChoice) {
        String cpuChoice = cpuChoice();
        System.out.println("cpu choice " + cpuChoice);

        if(player.throwGesture(playerChoice).beats(cpu.throwGesture(cpuChoice))) {
            counter.playerWon();
            System.out.println("Player won!");
        } else if (cpu.throwGesture(cpuChoice).beats(player.throwGesture(playerChoice))) {
            counter.computerWon();
            System.out.println("CPU won!");
        } else {
            System.out.println("It's a tie!");
        }




       /* if (player.throwGesture(playerChoice) == cpu.throwGesture(cpuChoice)) {
            System.out.println("Draw!");
        } else if ((player.throwGesture(playerChoice) == rock) && (cpu.throwGesture(cpuChoice) == scissors)) {
            if (rock.beats(scissors)) {counter.playerWon();}
        } else if ((player.throwGesture(playerChoice) == scissors) && (cpu.throwGesture(cpuChoice) == paper)) {
            if (scissors.beats(paper)) { counter.playerWon(); }
        } else if ((player.throwGesture(playerChoice) == paper) && (cpu.throwGesture(cpuChoice) == rock)) {
            if(paper.beats(rock)){ counter.playerWon(); }
        }else if ((cpu.throwGesture(cpuChoice) == rock) && (player.throwGesture(playerChoice) == scissors)){
            if(rock.beats(scissors)){ counter.computerWon(); }
        }else if ((cpu.throwGesture(cpuChoice) == scissors) && (player.throwGesture(playerChoice) == paper)){
            if(scissors.beats(paper)){ counter.computerWon(); }
        }else if ((cpu.throwGesture(cpuChoice) == paper) && (player.throwGesture(playerChoice) == rock)){
            if(paper.beats(rock)){ counter.computerWon(); }
        }*/
    }

    private String cpuChoice() {
        RandomGenerator randomGenerator = new RandomGenerator();
        int choice = randomGenerator.getRandom();
        switch (choice) {
            case 0:
                return "ROCK";

            case 1:
                return "SCISSORS";

            case 2:
                return "PAPER";

            default:
                return "shit went sideways";

        }
    }

}
