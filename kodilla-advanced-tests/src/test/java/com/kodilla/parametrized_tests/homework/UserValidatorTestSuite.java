package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"ja15", "odys-en", "nowak.13", "KaroLina112_2", "2020Jas"})
    public void shouldReturnTrueIfUserNameIsCorrect(String userName) {
        assertTrue(userValidator.validateUsername(userName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"nowak_12@o2.pl", "karolina.beniak4@wp.pl", "El_dorado@o2.pl"})
    public void shouldReturnTrueIfAdressEmailIsCorrect(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ma", "5 ", "!", "@", "~", "ż", "ó", "ł", " "})
    public void shouldReturnFalseIfUserNameIsIncorrect(String userName) {
        assertFalse(userValidator.validateUsername(userName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"namaste", "@nowa.pl", "janusz@nazwisko", "złoty@pole.pl", " "})
    public void shouldReturnFalseIfAdressEmailIsIncorrect(String email) {
        assertFalse(userValidator.validateEmail(email));

    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseIfUserNameIsEmpty(String userName){
        assertFalse(userValidator.validateUsername(userName));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseIfEmailIsEmpty(String email){
        assertFalse(userValidator.validateUsername(email));
    }

}
