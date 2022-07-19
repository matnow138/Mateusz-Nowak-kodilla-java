package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder().bun(new Bun(Bun.BUN_WITH_SESAME)).burgers(3).sauce(new Sauce(Sauce.BARBECUE)).ingredients(Ingredients.bacon).ingredients(Ingredients.cheese).ingredients(Ingredients.chilli).build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String bun = bigmac.getBun();
        int burgers = bigmac.getBurgers();
        //Then
        assertEquals(3, howManyIngredients);
        assertEquals("Bun with sesame", bun);
        assertEquals(3,burgers);



    }
}
