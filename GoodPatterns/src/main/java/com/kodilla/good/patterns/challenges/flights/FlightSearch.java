package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlightSearch {
    private AirportClass poznan = new AirportClass("Poznań", Arrays.asList("Kraków", "Warszawa", "Bydgoszcz"));
    private AirportClass warszawa = new AirportClass("Warszawa", Arrays.asList("Wrocław", "Szczecin", "Rzeszów"));
    private AirportClass katowice = new AirportClass("Katowice", Arrays.asList("Poznań", "Kraków", "Szczecin"));
    private AirportClass szczecin = new AirportClass("Szczecin", Arrays.asList("Rzesów", "Poznań", "Warszawa"));

    public void airportAdd(Flights flights){

        flights.airportAdd(poznan);
        flights.airportAdd(warszawa);
        flights.airportAdd(katowice);
        flights.airportAdd(szczecin);

    }
    public static void main(String args[]){
        Flights flights  = new Flights();
        FlightSearch flightSearch = new FlightSearch();
        flightSearch.airportAdd(flights);
        String startingAirport = "Poznań";
        String destinationAirport = "Warszawa";
        //TODO search, maybe another class/method?
        if(flights.getFlightMap().containsKey(startingAirport) && flights.getFlightMap().get(startingAirport).contains(destinationAirport)){
            System.out.println("It Works!");
        }
       FindFlight findFlight = new FindFlight(flights.getFlightMap());
        //System.out.println(findFlight.findFlight(startingAirport,destinationAirport));

    }
}
