package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b); //; wywolanie metody i przypisanie do zmiennej sumResult
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);

        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int substractResult = calculator.subtract(a, b);
        boolean correctRes = ResultChecker.assertEquals(8, substractResult);
        if (correctRes) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int squareAResult = calculator.squareA(a);
        boolean correctSquareA = ResultChecker.assertEquals(25, squareAResult);
        if (correctSquareA) {
            System.out.println("Metoda obliczania kwadratu działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda obliczania kwadratu nie działa poprawnie dla liczby " + a);
        }
        int squareBResult = calculator.squareA(a);
        boolean correctSquareB = ResultChecker.assertEquals(30, squareBResult);
        if (correctSquareB) {
            System.out.println("Metoda obliczania kwadratu działa poprawnie dla liczby " + b);
        } else {
            System.out.println("Metoda obliczania kwadratu nie działa poprawnie dla liczby " + b);
        }
    }
}
