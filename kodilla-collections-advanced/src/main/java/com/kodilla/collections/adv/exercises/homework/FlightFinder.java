package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure){
        List<Flight> listDepartures = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()){
            if (flight.getDeparture().equals(departure)){
                listDepartures.add(flight);
            }
        }

    }
    public List<Flight> findFlightsTo(String arrival){

    }

}
