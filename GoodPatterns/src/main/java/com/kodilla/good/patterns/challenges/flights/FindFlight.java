package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFlight {
    Map<String, List<String>> flights;
    String startingAirport;
    String destinationAirport;
    List<String> flightRoute = new ArrayList<>();

    public FindFlight(Map<String, List<String>> flights, String startingAirport, String destinationAirport) {
        this.flights = flights;
        this.startingAirport = startingAirport;
        this.destinationAirport = destinationAirport;
    }

    public boolean directFlight() {
        return flights.entrySet().stream()
                .filter(startAirport -> startAirport.getKey().equals(startingAirport))
                .anyMatch(target -> target.getValue().contains(destinationAirport));

    }

    public List<String> flightsToTown() {
        return flights.entrySet().stream()
                .filter(entry -> entry.getValue().contains(startingAirport))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


    }

    public void route(String startingAirport, String destinationAirport) {

        if (!directFlight()) {
            if (!startingAirport.equals(destinationAirport)) {
                if (flights.containsValue(destinationAirport)) {
                    for (var entry : flights.entrySet()) {
                        if (entry.getKey().equals(startingAirport))
                            for (String airport : entry.getValue()) {
                                route(airport, destinationAirport);
                            }
                        if (entry.getValue().contains(destinationAirport)) {
                            if (!flightRoute.contains(entry.getKey())) {
                                flightRoute.add(entry.getKey());
                            }
                        }


                    }
                }else{
                    System.out.println("There is no possible way");
            }
            }
        }

    }

    public void connectingFlight(String startingAirport, String destinationAirport) {


        route(startingAirport, destinationAirport);

        for (int i = 0; i <= flightRoute.size() - 1; i++) {
            System.out.println("You can fly to " + destinationAirport + " from " + startingAirport + " by " + flightRoute.get(i));
        }

    }


}
