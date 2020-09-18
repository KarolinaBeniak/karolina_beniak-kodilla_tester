package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> listDepartures = new ArrayList<>();
        for (Flight startFlight : FlightRepository.getFlightsTable()) {
            if (startFlight.getDeparture().equals(departure)) {
                listDepartures.add(startFlight);
            }
        }
        return listDepartures;

    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> listArrivals = new ArrayList<>();
        for (Flight endFlight : FlightRepository.getFlightsTable()) {
            if (endFlight.getArrival().equals(arrival)) {
                listArrivals.add(endFlight);
            }
        }
        return listArrivals;
    }

}
