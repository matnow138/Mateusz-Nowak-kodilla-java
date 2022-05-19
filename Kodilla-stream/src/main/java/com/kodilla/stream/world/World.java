package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CheckedOutputStream;

public final class World {
   // private final BigDecimal peopleQuantity;
    final List<World> worldList = new ArrayList<>();
    final List<Continent> continents = new ArrayList<>();

    final List<Country> countryListEurope = new ArrayList<>();




    public BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(country -> country.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,current) -> sum =sum.add(current));

    }
}
