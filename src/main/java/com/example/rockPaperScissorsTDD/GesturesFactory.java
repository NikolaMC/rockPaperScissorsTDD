package com.example.rockPaperScissorsTDD;

public class GesturesFactory {

    public Gestures getGesture(String gesture){
        if (gesture.equalsIgnoreCase("ROCK")) {
            return new Rock();
        }
        if (gesture.equalsIgnoreCase("PAPER")) {
            return new Paper();
        }
        if (gesture.equalsIgnoreCase("SCISSORS")) {
            return new Scissors();
        }
        return null;
    }
}
