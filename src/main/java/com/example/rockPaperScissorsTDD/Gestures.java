package com.example.rockPaperScissorsTDD;

public interface Gestures {
    boolean beats(Paper paper);
    boolean beats(Rock rock);
    boolean beats(Scissors scissors);
    boolean beats(Gestures gestures);
}
