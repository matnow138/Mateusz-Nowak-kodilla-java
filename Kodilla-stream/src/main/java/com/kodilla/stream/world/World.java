package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public final class World {

    Continent continent;
   static  List<Continent> world = new ArrayList<>();


    public World(List<Continent> world) {
        World.world = world;
    }

    public BigDecimal getPeopleQuantity(){
        return world.stream()
                .flatMap(country -> country.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,current) -> sum =sum.add(current));

    }
}
