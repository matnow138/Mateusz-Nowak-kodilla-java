package com.kodilla.good.patterns.challenges.flights;

import java.util.Arrays;

public class FlightSearch {
    final private AirportClass poznan = new AirportClass("Poznań", Arrays.asList("Kraków", "Warszawa", "Bydgoszcz"));
    final private AirportClass warszawa = new AirportClass("Warszawa", Arrays.asList("Wrocław", "Szczecin", "Rzeszów"));
    final private AirportClass katowice = new AirportClass("Katowice", Arrays.asList("Poznań", "Kraków", "Bydgoszcz"));
    final private AirportClass szczecin = new AirportClass("Szczecin", Arrays.asList("Rzeszów", "Poznań", "Warszawa"));
    final private AirportClass bydgoszcz = new AirportClass("Bydgoszcz", Arrays.asList("Szczecin", "Kraków", "Warszawa"));

    public void airportAdd(Flights flights) {

        flights.airportAdd(poznan);
        flights.airportAdd(warszawa);
        flights.airportAdd(katowice);
        flights.airportAdd(szczecin);
        flights.airportAdd(bydgoszcz);
    }


}
