package com.kodilla.good.patterns.challenges.flights;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindFlight {
    Map<String, List<String>> flights;

    public FindFlight(Map<String, List<String>> flights) {
        this.flights = flights;
    }

   public Optional<String> findFlight(String startingAirport, String destinationAirport) {
       return flights.entrySet().stream()
               .filter(entry -> entry.getKey().equals(startingAirport))
               //.filter(startAirport -> startAirport.getValue().contains(destinationAirport))
               .findFirst()
               .orElse(
               .map(startAirport -> startAirport.getValue().stream()
                       .map(possibleAirport -> findFlight(possibleAirport,destinationAirport))

               )






   }




    }

}
