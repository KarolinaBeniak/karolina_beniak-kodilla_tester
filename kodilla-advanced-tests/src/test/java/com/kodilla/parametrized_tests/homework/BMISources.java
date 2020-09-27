package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMISources {
    static Stream<Arguments> provideValuesForCalcBMIForTesting() {
        return Stream.of(
                Arguments.of(1.70, 40.0, "Very severely underweight"),
                Arguments.of(1.70, 45.0, "Severely underweight"),
                Arguments.of(1.70, 50.0, "Underweight"),
                Arguments.of(1.65, 60.0, "Normal (healthy weight)"),
                Arguments.of(1.65, 70.0, "Overweight"),
                Arguments.of(1.50, 70.0, "Obese Class I (Moderately obese)"),
                Arguments.of(1.60, 95.0, "Obese Class II (Severely obese)"),
                Arguments.of(1.50, 90.0, "Obese Class III (Very severely obese)"),
                Arguments.of(1.50, 140.0, "Obese Class VI (Hyper Obese)"),
                Arguments.of(1.45, 110.0, "Obese Class V (Super Obese)"),
                Arguments.of(1.50, 200.0, "Obese Class VI (Hyper Obese)"),
                Arguments.of(0.0, 0.0, "Incorrect value. Try again!")
        );
    }
}
