package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.BMISources#provideValuesForCalcBMIForTesting")
    public void shouldCalculateBMI(double height, double weight, String expectedResult) {
        assertEquals(expectedResult, new Person(height, weight).getBMI());
    }
}