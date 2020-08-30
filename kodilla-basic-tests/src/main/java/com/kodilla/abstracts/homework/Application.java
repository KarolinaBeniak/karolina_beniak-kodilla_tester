package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape squarePerimeter = new Square(3);
        Shape squareArea = new Square(2);
        Shape rectanglePerimeter = new Rectangle(4, 6);
        Shape rectangleArea = new Rectangle(4, 4);
        Shape circlePerimeter = new Circle(3);
        Shape cirlceArea = new Circle(4);

        Shape[] tablicaShape = new Shape[6];

        tablicaShape[0] = squarePerimeter;
        tablicaShape[1] = squareArea;
        tablicaShape[2] = rectanglePerimeter;
        tablicaShape[3] = rectangleArea;
        tablicaShape[4] = circlePerimeter;
        tablicaShape[5] = cirlceArea;

        for (Shape result : tablicaShape) {
            if (result.typ().equals("Circle")) {
                System.out.println("Circle\n" + "Perimeter:" + result.calculatePerimeter() + "\n" + "Area: " + result.calculateArea());

            } else if (result.typ().equals("Rectangle")) {
                System.out.println("Rectangle\n" + "Perimeter:" + result.calculatePerimeter() + "\n" + "Area: " + result.calculateArea());
            } else {
                System.out.println("Square\n" + "Perimeter:" + result.calculatePerimeter() + "\n" + "Area: " + result.calculateArea());
            }
        }
    }
}