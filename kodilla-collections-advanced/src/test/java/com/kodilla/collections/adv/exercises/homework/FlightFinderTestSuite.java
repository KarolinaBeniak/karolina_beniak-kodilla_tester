package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();

        List<Flight> startTest = flightFinder.findFlightsFrom("Wroclaw");

        List<Flight> scheduledList = new ArrayList<>();
        scheduledList.add(new Flight("Wroclaw", "Warsaw"));

        assertEquals(scheduledList, startTest);

    }

    @Test
    public void testFindFlightsTo() {

        FlightFinder flightFinder = new FlightFinder();
        List<Flight> endTest = flightFinder.findFlightsTo("Paris");

        List<Flight> scheduledList = new ArrayList<>();
        scheduledList.add(new Flight("Gdansk", "Paris"));
        assertEquals(scheduledList, endTest);

    }

    @Test
    public void testNoDepartureFromAirport() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> noDepartureTest = flightFinder.findFlightsFrom("Katowice");
        List<Flight> scheduledList = new ArrayList<>();
        scheduledList.isEmpty();

        assertEquals(scheduledList, noDepartureTest);
    }

    @Test
    public void testNoAirportArrivals() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> noArrivalsTest = flightFinder.findFlightsTo("Zakopane");
        List<Flight> scheduledList = new ArrayList<>();
        scheduledList.isEmpty();
        assertEquals(scheduledList, noArrivalsTest);
    }

    @Test
    public void testMoreThanOneDepartureFromAirport() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> startTest = flightFinder.findFlightsFrom("Wroclaw");
        List<Flight> scheduledList = new ArrayList<>();
        scheduledList.add(new Flight("Wroclaw", "Warsaw"));
        scheduledList.add(new Flight("Wroclaw", "Cracov"));
        scheduledList.add(new Flight("Zakopane", "Poznan"));

        assertEquals(1, startTest.size());
    }

    @Test
    public void testMoreThanOneArrivalFromAirport() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> endTest = flightFinder.findFlightsTo("Paris");
        List<Flight> scheduledList = new ArrayList<>();
        scheduledList.add(new Flight("Wroclaw", "Paris"));
        scheduledList.add(new Flight("Gdansk", "Paris"));
        scheduledList.add(new Flight("Zakopane", "Poznan"));

        assertEquals(1, endTest.size());
    }
    @Test
    public void testNullIsParametrToFindFlightsFrom(){
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> nullTest = flightFinder.findFlightsFrom(null);

        assertNull(null, "The object is empty.Try again.");
    }
    @Test
    public void testNullIsParametrToFindFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> nullTest = flightFinder.findFlightsTo(null);

        assertNull(null, "The object is empty.Try again.");
    }
}
