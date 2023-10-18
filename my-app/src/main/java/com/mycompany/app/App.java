package com.mycompany.app;

import static java.lang.System.out;

public class App
{
    public static void main( String[] args )
    {
        Circle circle = new Circle(5);
        out.println("Circumference of the circle is equal to " + circle.getCircumference());

        Square square = new Square(12);
        //Byłem tu
        out.println("Area of the square is equal to " + square.getField());
    }
}
