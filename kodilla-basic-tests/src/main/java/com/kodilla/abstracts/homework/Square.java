package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square() {
        super(4);
    }

    @Override
    public void calculateArea() {
        System.out.println("Area square :");
    }

    @Override
    public void calculateCircuit() {
        System.out.println("Circuit square :");
    }
}