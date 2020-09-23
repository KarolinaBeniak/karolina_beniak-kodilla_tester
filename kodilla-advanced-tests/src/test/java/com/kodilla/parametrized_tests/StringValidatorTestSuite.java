package com.kodilla.parametrized_tests;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;


import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTestSuite {
    private StringValidator validator = new StringValidator();

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }

    @Test
    public void shouldReturnFalseIfStringIsNotEmpty() {
        assertFalse(validator.isBlank("karol"));
    }

    @Test
    public void shouldReturnTrueIfStringIsNotEmpty() {
        assertTrue(validator.isBlank(""));

    }

    @Test
    public void shouldReturnTrueIfStringIsNull() {
        assertTrue(validator.isBlank(null));
    }
}
