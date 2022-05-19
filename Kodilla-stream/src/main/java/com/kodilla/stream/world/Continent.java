package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Continent {

    private final String continentName;
    private final List<Country> countries;

    public Continent(final String continentName,List<Country> countries ) {
        this.continentName = continentName;
        this.countries = new ArrayList<>(countries);
    }
    //dane niech przyjdą z zewnątrz, to nie tylko ładniej, ale upraszcza klasę


    //nie trzeba nowej listy, tak nikt Ci nie pogrzebie w niej
    public List<Country> getCountries() {
        return Collections.unmodifiableList(countries);
    }

}
