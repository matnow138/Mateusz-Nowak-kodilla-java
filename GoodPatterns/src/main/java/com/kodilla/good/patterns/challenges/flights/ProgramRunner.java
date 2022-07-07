package com.kodilla.good.patterns.challenges.flights;

public class ProgramRunner {

    public static void main(String args[]) {
        Flights flights = new Flights();
        FlightSearch flightSearch = new FlightSearch();
        flightSearch.airportAdd(flights);

        String startingAirport = "Poznań";
        String destinationAirport = "Lódź";

        if (flights.getFlightMap().containsKey(startingAirport) && flights.getFlightMap().get(startingAirport).contains(destinationAirport)) {
            System.out.println("It Works!");
        }
        FindFlight findDirectFlight = new FindFlight(flights.getFlightMap(), startingAirport, destinationAirport);
        System.out.println(findDirectFlight.directFlight());

        FindFlight findFlightsToTown = new FindFlight(flights.getFlightMap(), startingAirport, destinationAirport);
        System.out.println("You can fly to " + startingAirport + " from " + findFlightsToTown.flightsToTown());

        FindFlight findConnectionFlight = new FindFlight(flights.getFlightMap(), startingAirport, "Szczecin");
        findConnectionFlight.connectingFlight(startingAirport, "Szczecin");
    }
}
