package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom() {
        FlightFinder startFlight = new FlightFinder();

        List<Flight> startTest = startFlight.findFlightsFrom("Wroclaw");

        List<Flight> scheduledList = new ArrayList<>();
        scheduledList.add(new Flight("Wroclaw", "Warsaw"));

        assertEquals(scheduledList, startTest);

    }

    @Test
    public void testFindFlightsTo() {

        FlightFinder endFlight = new FlightFinder();
        List<Flight> endTest = endFlight.findFlightsTo("Paris");

        List<Flight> scheduledList = new ArrayList<>();
        scheduledList.add(new Flight("Gdansk", "Paris"));
        assertEquals(scheduledList, endTest);

    }
}
