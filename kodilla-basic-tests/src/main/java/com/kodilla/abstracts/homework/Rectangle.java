package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle(){
        super(5);

    }

    @Override
    public void calculateArea() {
        System.out.println("Area rectangle :");

    }

    @Override
    public void calculateCircuit() {
        System.out.println("Circuit rectangle :");

    }
}
