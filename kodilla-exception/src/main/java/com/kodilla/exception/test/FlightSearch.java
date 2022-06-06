package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String,Boolean> airportMap= new HashMap<>();

        airportMap.put("Poznań",true);
        airportMap.put("Warszawa",false);
        airportMap.put("Szczecin", true);
        if(airportMap.containsKey(flight.getArrivalAirport())){
            if(airportMap.get(flight.arrivalAirport)==true){
                System.out.println("You can fly to this airport");
            } else if(airportMap.get(flight.arrivalAirport)==false){
                System.out.println("You cant fly to this airport");
            }
        }else{
            throw new RouteNotFoundException();
        }
    }
}
