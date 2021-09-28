package com.example.rockPaperScissorsTDD;

public interface Gestures {
    public boolean beats(Paper paper);
    public boolean beats(Rock rock);
    public boolean beats(Scissors scissors);
}
