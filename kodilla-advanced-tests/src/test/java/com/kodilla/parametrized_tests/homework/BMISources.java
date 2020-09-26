package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMISources {
    static Stream<Arguments> provideValuesForCalcBMIForTesting() {
        return Stream.of(
                Arguments.of(1.70, 40.0, "Very severely underweight"),
                Arguments.of(1.50, 90.0, "Obese Class III (Very severely obese)"),
                Arguments.of(1.60, 55.0, "Normal (healthy weight)"),
                Arguments.of(1.50, 140.0, "Obese Class VI (Hyper Obese)")
        );
    }
}
