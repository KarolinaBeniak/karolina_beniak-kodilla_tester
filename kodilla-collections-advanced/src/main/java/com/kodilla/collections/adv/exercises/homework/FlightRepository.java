package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    static List<Flight> getFlightsTable() {
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Wroclaw", "Warsaw"));
        flightList.add(new Flight("Warsaw", "London"));
        flightList.add(new Flight("Gdansk", "Paris"));
        return flightList;

    }
}
