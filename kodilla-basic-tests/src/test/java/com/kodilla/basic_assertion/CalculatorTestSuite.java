package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int a = 4;
        int b = 3;
        int subResult = calculator.subtract(a, b);
        assertEquals(1, subResult);
    }

    @Test
    public void testToSquareNumberGreaterThanZero() {
        Calculator calculator = new Calculator();
        int a = 8;
        int squareResult = calculator.square(a);
        assertEquals(64, squareResult);
    }

    @Test
    public void testToSquareNumberLessThanZero() {
        Calculator calculator = new Calculator();
        int a = -9;
        int squareResult = calculator.square(a);
        assertEquals(81, squareResult);
    }

    @Test
    public void testToSquareEqualsZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        int squareResult = calculator.square(a);
        assertEquals(0, squareResult);
    }
}