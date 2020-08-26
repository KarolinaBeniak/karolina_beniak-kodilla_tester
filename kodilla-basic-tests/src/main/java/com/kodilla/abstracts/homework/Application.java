package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square squareArea = new Square(); squareArea.calculateArea();

        Square squareCircuit = new Square(); squareCircuit.calculateCircuit();

        Rectangle rectangleArea = new Rectangle(); rectangleArea.calculateArea();

        Rectangle rectangleCircuit = new Rectangle(); rectangleCircuit.calculateCircuit();

        Circle circleArea = new Circle(); circleArea.calculateArea();

        Circle cirlceCircuit = new Circle(); cirlceCircuit.calculateCircuit();
    }
}
