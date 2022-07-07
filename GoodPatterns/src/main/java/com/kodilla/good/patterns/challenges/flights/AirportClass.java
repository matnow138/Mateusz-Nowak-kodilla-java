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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AirportClass that = (AirportClass) o;

        if (!name.equals(that.name)) return false;
        return flights.equals(that.flights);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + flights.hashCode();
        return result;
    }
}
