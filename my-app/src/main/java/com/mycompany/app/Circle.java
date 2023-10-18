package com.mycompany.app;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return Math.PI * 2 * radius;
    }
}

