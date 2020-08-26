package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int lengthSide;

    public Shape(int lengthSide) {
        this.lengthSide = lengthSide;
    }
    public int getLengthSide() {
        return lengthSide;
    }

    public abstract void calculateArea();

    public abstract void calculateCircuit();

}
