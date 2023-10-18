package com.mycompany.app;

public class Square {
    private final double side;
    public Square(double side) {
        this.side = side;
    }

    public double getField() {
        return side * side;
    }
}