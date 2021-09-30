package com.example.rockPaperScissorsTDD;

public class Paper implements Gestures {

    @Override
    public boolean beats(Paper paper) { return false; }

    @Override
    public boolean beats(Rock rock) { return true; }

    @Override
    public boolean beats(Scissors scissors) {
        return false;
    }

    @Override
    public boolean isBeatenBy(Gestures gestures) {
        return gestures.beats(this);
    }

}
