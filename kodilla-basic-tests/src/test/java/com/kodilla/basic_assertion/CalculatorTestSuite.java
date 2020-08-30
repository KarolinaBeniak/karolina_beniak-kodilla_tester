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
        Calculator calculatorSub = new Calculator();
        int a = 4;
        int b = 3;
        int subResult = calculatorSub.subtract(a,b);
        assertEquals(1,subResult);
    }
    @Test
    public void testPowerPlus(){
        Calculator calculatorPlus = new Calculator();
        int a =5;
        int plusPowerResult = calculatorPlus.squareA(a);
        assertEquals(25,plusPowerResult);
    }
    @Test
    public void testNegativePower(){
        Calculator calculatorNegative = new Calculator();
        int a = -4;
        int plusNegativeResult = calculatorNegative.squareA(a);
        assertNotEquals(-16,plusNegativeResult);
    }
    @Test
    public void testPower0(){
        Calculator calculatorZero = new Calculator();
        int a = 0;
        assertEquals(0,0);
    }
}