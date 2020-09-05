package com.kodilla.collections.interfaces;

import static java.lang.Math.PI;

public class Circle implements Shape{
    private double radius;


    public Circle(double radius) {
        this.radius = radius;

    }
    public double getArea(){
        return PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
}
