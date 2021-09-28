package com.example.rockPaperScissorsTDD;

import java.util.Scanner;

public class Game {
    private final Rock rock = new Rock();
    private final Scissors scissors = new Scissors();
    private final Paper paper = new Paper();
    private GesturesFactory gesturesFactory = new GesturesFactory();
    private final GameCounter counter = new GameCounter();

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

            System.out.println(player.getName() + " score: " + counter.getPlayerPoints());
            System.out.println(cpu.getName() + " score: " + counter.getComputerPoints());

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

        /*System.out.println("players choice " + (player.throwGesture(playerChoice)));
        System.out.println("cpu choice " + cpu.throwGesture(cpuChoice));*/

        if ((playerChoice.equals(cpuChoice))) {
            System.out.println("Draw!");
        } else if ((playerChoice.equals("ROCK")) && (cpuChoice.equals("SCISSORS"))) {
            if (rock.beats(scissors)) {counter.playerWon();}
        } else if ((playerChoice.equals("SCISSORS")) && (cpuChoice.equals("PAPER"))) {
            if (scissors.beats(paper)) { counter.playerWon(); }
        } else if ((playerChoice.equals("PAPER")) && (cpuChoice.equals("ROCK"))) {
            if(paper.beats(rock)){ counter.playerWon(); }
        }else if ((cpuChoice.equals("ROCK")) && (playerChoice.equals("SCISSORS"))){
            if(rock.beats(scissors)){ counter.computerWon(); }
        }else if ((cpuChoice.equals("SCISSORS")) && (playerChoice.equals("PAPER"))){
            if(scissors.beats(paper)){ counter.computerWon(); }
        }else if ((cpuChoice.equals("PAPER")) && (playerChoice.equals("ROCK"))){
            if(paper.beats(rock)){ counter.computerWon(); }
        }

        /*

        if(player.throwGesture(playerChoice).beats(cpu.throwGesture(cpuChoice))) {
            counter.playerWon();
            System.out.println("Player won!");
        } else if (cpu.throwGesture(cpuChoice).beats(player.throwGesture(playerChoice))) {
            counter.computerWon();
            System.out.println("CPU won!");
        } else {
            System.out.println("It's a tie!");
        }
*/
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
