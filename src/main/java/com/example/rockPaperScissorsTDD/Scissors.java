package com.example.rockPaperScissorsTDD;

public class Scissors implements GameUtilsInterface {
    @Override
    public boolean beats(Rock rock) {
        return false;
    }

    @Override
    public boolean beats(Paper paper) {
        return true;
    }

    @Override
    public boolean beats(Scissors scissors) {
        return false;
    }
}
