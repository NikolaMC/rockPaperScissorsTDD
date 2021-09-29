package com.example.rockPaperScissorsTDD;

public class GesturesFactory {

    public Gestures getGesture(String gesture) {
        if (gesture.equals("ROCK")) {
            return new Rock();
        }
        if (gesture.equals("PAPER")) {
            return new Paper();
        }
        if (gesture.equals("SCISSORS")) {
            return new Scissors();
        }
        return null;
    }
}
