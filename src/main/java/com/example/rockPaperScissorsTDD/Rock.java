package com.example.rockPaperScissorsTDD;

public class Rock implements Gestures {

    @Override
    public boolean beats(Paper paper) { return false; }

    @Override
    public boolean beats(Rock rock) { return false; }

    @Override
    public boolean beats(Scissors scissors) { return true; }

    @Override
    public boolean beats(Gestures gestures) {
        return gestures.beats(this);
    }

}
