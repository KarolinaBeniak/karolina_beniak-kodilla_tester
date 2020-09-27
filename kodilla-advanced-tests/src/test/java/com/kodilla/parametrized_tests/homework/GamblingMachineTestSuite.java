package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersOfGamblingMachine.csv", numLinesToSkip = 1)
    public void numberOfWinsShouldBeInTheRange(String numbers) throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        String[] tempTab = numbers.split(" ");
        Set<Integer> integerSet = new HashSet<>();
        for (String element : tempTab) {
            integerSet.add(Integer.parseInt(element));
        }
        assertTrue(gamblingMachine.howManyWins(integerSet) <= 6 && gamblingMachine.howManyWins(integerSet) >= 0);
        System.out.println(integerSet);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionIfNumbersAreIncorrect(String inputLine) {
        GamblingMachine gamblingMachine = new GamblingMachine();
        String[] tempTab = inputLine.split(" ");
        Set<Integer> inputNumbers = new HashSet<>();
        for (String element : tempTab) {
            inputNumbers.add(Integer.parseInt(element));
        }
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(inputNumbers));
    }
}
