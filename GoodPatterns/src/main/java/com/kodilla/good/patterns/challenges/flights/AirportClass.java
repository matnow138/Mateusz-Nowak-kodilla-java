package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AirportClass{
    private String name;
    private List<String> flights;

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
