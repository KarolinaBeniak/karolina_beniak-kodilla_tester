package com.kodilla.abstracts.homework;

public class New {
    public static void main(String[] args) {
        Shape squarePerimeter = new Square(3);
        Shape squareSurfaceArea = new Square(2);
        Shape rectanglePerimeter = new Rectangle(4, 6);
        Shape rectangleSurfaceArea = new Rectangle(4, 4);
        Shape circlePerimeter = new Circle(3);
        Shape cirlceSurfaceArea = new Circle(4);

        Shape[] tablicaShape = new Shape[5];

        tablicaShape[0] = squarePerimeter;
        tablicaShape[1] = squareSurfaceArea;
        tablicaShape[2] = rectanglePerimeter;
        tablicaShape[3] = rectangleSurfaceArea;
        tablicaShape[4] = circlePerimeter;
        tablicaShape[5] = cirlceSurfaceArea;

        int result = 0;
        for (Shape sideA : tablicaShape) {
            result = sideA.calculatePerimeter();
            System.out.println("Square\n" + "Perimeter :" + result);
        }
    }
}
