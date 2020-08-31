package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public int sideA;
    public final static String square ="Square";

    public Square(int a) {
        this.sideA = a;
    }


    @Override
    public int calculatePerimeter() {
        return sideA*4;
    }

    @Override
    public int calculateArea() {
        return sideA*sideA;
    }

    @Override
    public String typ() {
        return "Square";
    }
}