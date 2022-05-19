package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

import java.util.List;

import java.util.Collections;

public final class Continent {
    private final String continentName;

    private final List<Continent> continentList = new ArrayList<>();
    private final List<Country> countries;

    public Continent(final String continentName, final List <Country> countries) {
        this.continentName = continentName;
        this.countries = countries;
    }

    public List<Country> getCountries (){
        return new ArrayList<>(countries);
    }

    public String getContinentName() {
        return continentName;
    }
}
