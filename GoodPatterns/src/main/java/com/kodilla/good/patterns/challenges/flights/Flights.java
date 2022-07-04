package com.kodilla.good.patterns.challenges.flights;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flights {
    private Map<String, List> flightMap = new HashMap<>();

    public void airportAdd(AirportClass airport){
        flightMap.put(airport.getName(), airport.getFlights());
    }

    public Map<String, List> getFlightMap() {
        return flightMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flights flights = (Flights) o;

        return flightMap != null ? flightMap.equals(flights.flightMap) : flights.flightMap == null;
    }

    @Override
    public int hashCode() {
        return flightMap.hashCode();
    }
}
