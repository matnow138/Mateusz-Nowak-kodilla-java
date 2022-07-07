package com.kodilla.good.patterns.challenges.flights;


import java.util.List;


public class AirportClass{
    final private String name;
    final private List<String> flights;

    public AirportClass(String name, List<String> flights){
        this.flights=flights;
        this.name = name;
    }

    public List<String> getFlights() {
        return flights;
    }

    public String getName() {
        return name;
    }
}
