package com.kodilla.good.patterns.challenges.flights;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class FindFlight {
    Map<String, List> flights;

    public FindFlight(Map<String, List> flights) {
        this.flights = flights;
    }

    public Optional<String> findFlight(String startingAirport, String destinationAirport) {
        return flights.entrySet().stream()
                .filter(entry -> entry.getKey().equals(startingAirport))

                .flatMap(startAirport -> startAirport.getValue().stream()
                        .filter(target -> target.equals(destinationAirport))
                        .findFirst()
                        .orElse(
                                startAirport.getValue().stream()

                                        .flatMap(possibleAirports -> findFlight(possibleAirports, destinationAirport).orElse(null))
                                        .findFirst()
                                        .orElse(null)
                        )
                ).findFirst();


    }

}
