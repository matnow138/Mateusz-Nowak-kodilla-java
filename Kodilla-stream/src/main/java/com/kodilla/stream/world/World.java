package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
   // private final BigDecimal peopleQuantity;
    final List<World> worldList = new ArrayList<>();
    final List<Continent> continents = new ArrayList<>();

    private void fillData(){
        //...
    }

    public BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,current) -> sum =sum.add(current));

    }
}
