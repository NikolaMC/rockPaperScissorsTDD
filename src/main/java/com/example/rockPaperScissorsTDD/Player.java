package com.example.rockPaperScissorsTDD;

public class Player {

    private String name;
    private final Rock rock = new Rock();
    private final Paper paper = new Paper();
    private final Scissors scissors = new Scissors();

    public Player(String name) {
        this.name = name;
    }

    public Gestures throwGesture(String gestureName) {
        GesturesFactory gesturesFactory = new GesturesFactory();
        return gesturesFactory.getGesture(gestureName);
    }

    public Rock throwRock() {
        return rock;
    }

    public Paper throwPaper() {
        return paper;
    }

    public Scissors throwScissors() {
        return scissors;
    }

    public String getName() {
        return name;
    }

}