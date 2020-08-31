package com.kodilla.abstracts.homework;
import static java.lang.Math.*;
public class Rectangle extends Shape {

    private int sideB;
    private int sideC;
    public final static String rectangle ="rectangle";


    public Rectangle(int b, int c){
        this.sideB = b;
        this.sideC = c;
    }

    @Override
    public int calculatePerimeter() {
        double b2 = pow(sideB,2);
        double c2 = pow(sideC,2);
        return (int) (b2 + c2);

    }

    @Override
    public int calculateArea(){
      return sideB*sideC;

    }

    @Override
    public String typ() {
        return "Rectangle";
    }
}
