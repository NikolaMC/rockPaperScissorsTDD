package com.example.rockPaperScissorsTDD;

public class Rock implements GameUtilsInterface {
    @Override
    public boolean beats(Paper paper) {
        return false;
    }

    @Override
    public boolean beats(Scissors scissors) {
        return true;
    }

    @Override
    public boolean beats(Rock rock) {
        return false;
    }
}
