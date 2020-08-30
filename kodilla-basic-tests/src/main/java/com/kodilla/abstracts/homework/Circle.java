package com.kodilla.abstracts.homework;
import static java.lang.Math.*;
public class Circle extends Shape {
    private int sideR;

    public Circle(int r) {
        this.sideR = r;
    }

    @Override
    public int calculatePerimeter() {
        final double PI = 3.14;
        return (int) (2 * PI * sideR);
    }

    @Override
    public int calculateArea() {
        final double PI = 3.14;
        double r2 = pow(sideR,2);
        return (int) ((int) PI * r2);
    }

    @Override
    public String typ() {
        return "Circle";
    }
}
