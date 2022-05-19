package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class Continent {
    private final String continentName;
    private final Country country;
    private final List<Continent> continentList = new ArrayList<>();

    public Continent(final String continentName, final Country country) {
        this.continentName = continentName;
        this.country = country;
    }

       public Country getCountryName() {
        return country;
    }

    public void countryListEurope (){
        continentList.add(new Continent("Europe", new Country("Poland", BigDecimal.valueOf(123456789))));
        continentList.add(new Continent("Asia", new Country("Japan", BigDecimal.valueOf(123456789))));

    }

    public List<Continent> getContinentList (){
        return new ArrayList<>(continentList);

    }

}
