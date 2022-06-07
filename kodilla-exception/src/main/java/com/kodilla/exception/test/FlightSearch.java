package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException{
        if (flight!=null) {
            Map<String, Boolean> airportMap = new HashMap<>();

            airportMap.put("Poznań", true);
            airportMap.put("Warszawa", false);
            airportMap.put("Szczecin", true);
            airportMap.put("London", false);
            airportMap.put("Oslo", true);
            airportMap.put("Bydgoszcz", false);
            airportMap.put("Berlin", true);
            if (airportMap.containsKey(flight.getArrivalAirport())) {
                if (airportMap.get(flight.getDepartureAirport()) == true && (airportMap.get(flight.getArrivalAirport()) == true)) {
                    System.out.println("You can fly this route");
                } else if (airportMap.get(flight.getDepartureAirport()) == false || (airportMap.get(flight.getArrivalAirport()) == false)) {
                    System.out.println("You cant fly this route");
                }
            } else {
                throw new RouteNotFoundException();
            }
        } else{
            System.out.println("Flight rout cant be empty");
        }
    }
}
