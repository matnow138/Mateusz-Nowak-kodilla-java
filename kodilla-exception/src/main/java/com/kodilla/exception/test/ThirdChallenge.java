package com.kodilla.exception.test;

public class ThirdChallenge {

    public static void main(String[] args){
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(new Flight("Warszawa", "Katowice"));
        }catch (RouteNotFoundException e){
            System.out.println("Error!");
        }

    }
}
