package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape squareArea = new Square(); squareArea.calculateArea();

        Shape squareCircuit = new Square(); squareCircuit.calculateCircuit();

        Shape rectangleArea = new Rectangle(5, 2); rectangleArea.calculateArea();

        Shape rectangleCircuit = new Rectangle(2, 6); rectangleCircuit.calculateCircuit();

        Shape circleArea = new Circle(); circleArea.calculateArea();

        Shape cirlceCircuit = new Circle(); cirlceCircuit.calculateCircuit();
    }
}
