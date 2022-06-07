package com.kodilla.exception.test;

public class FlightRunner {

    public static void main(String[] args){
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(new Flight("Warszawa", "Wroclaw"));
        }catch (RouteNotFoundException e){
            System.out.println("Error! Chosen town is not in the list.");
        }

    }
}
