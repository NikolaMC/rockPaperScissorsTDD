package com.example.rockPaperScissorsTDD;

public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public Gestures throwGesture(String gestureName) {
        GesturesFactory gesturesFactory = new GesturesFactory();
        return gesturesFactory.getGesture(gestureName);
    }

    public String getName() {
        return name;
    }

}