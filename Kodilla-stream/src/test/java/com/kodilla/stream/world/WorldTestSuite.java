package com.kodilla.stream.world;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {
    List<Country> countryListEurope = new ArrayList<>();
    List<Country> countryListAsia = new ArrayList<>();
    List<Country> countryListAfrica = new ArrayList<>();
    List<Continent> continentList = new ArrayList<>();

    @DisplayName("Test for people quantity")
    @Test
    void testPeopleQuantity(){
        //Given
        countryListEurope.add(new Country("Poland", BigDecimal.valueOf(123456789)));
        countryListEurope.add(new Country("Germany", BigDecimal.valueOf(987654321)));
        countryListEurope.add(new Country("France", BigDecimal.valueOf(456789123)));

        countryListAsia.add(new Country("Japan", BigDecimal.valueOf(1111111111)));
        countryListAsia.add(new Country("China", BigDecimal.valueOf(741852963)));
        countryListAsia.add(new Country("India", BigDecimal.valueOf(369258147)));

        countryListAfrica.add(new Country("Egypt", BigDecimal.valueOf(258369147)));
        countryListAfrica.add(new Country("RPA", BigDecimal.valueOf(159263748)));
        countryListAfrica.add(new Country("Kongo", BigDecimal.valueOf(968357241)));

        continentList.add(new Continent("Europe", countryListEurope));
        continentList.add(new Continent("Asia", countryListAsia));
        continentList.add(new Continent("Africa", countryListAfrica));

        World world = new World(continentList);


        //When

            BigDecimal totalPeopleQuantity = world.getPeopleQuantity() ;

        //Then
        BigDecimal expectedPeopleQuantity =BigDecimal.valueOf(5176112590L);
        assertEquals(totalPeopleQuantity, expectedPeopleQuantity);
        }
    }


