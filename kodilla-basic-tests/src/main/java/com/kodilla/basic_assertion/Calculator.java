package com.kodilla.basic_assertion;

import static java.lang.Math.*;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int square(int a) {
        int a2 = (int) pow(a, 2);
        return a2;
    }
}
