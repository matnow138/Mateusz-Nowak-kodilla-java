package com.kodilla.good.patterns.challenges.flights;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindFlight {
    Map<String, List<String>> flights;
    String startingAirport;
    String destinationAirport;

    public FindFlight(Map<String, List<String>> flights, String startingAirport, String destinationAirport) {
        this.flights = flights;
        this.startingAirport = startingAirport;
        this.destinationAirport = destinationAirport;
    }

    public Boolean directFlight(){
        return flights.entrySet().stream()
                .filter(startAirport -> startAirport.getKey().equals(startingAirport))
                .anyMatch(target -> target.getValue().contains(destinationAirport));

}
   /* public List<String> flightsToTown(){
        return flights.entrySet().stream()
                .map(startAirport -> startAirport.getValue())
                .flatMap(Collection::stream)
                .filter(target -> target.contains(startingAirport))
                .map(airport -> airport.g)
                .collect(Collectors.toList());
    }*/
    public List<String> flightsToTown(){
        return flights.entrySet().stream()
                .map(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey))

    }




}
