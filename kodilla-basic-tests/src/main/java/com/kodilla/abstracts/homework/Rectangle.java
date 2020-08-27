package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    private int sideA;
    private int sideB;

    public Rectangle(int a, int b){
        this.sideA = a;
        this.sideB = b;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area rectangle: " + sideB * sideB);

    }

    @Override
    public void calculateCircuit() {
        System.out.println("Circuit rectangle :");

    }
}
