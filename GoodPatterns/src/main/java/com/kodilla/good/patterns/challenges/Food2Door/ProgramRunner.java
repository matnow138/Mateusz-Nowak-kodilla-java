package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ProgramRunner {

    public static void main(String[] args) {
        final List<Producer> producers = new ArrayList<>();

        Producer extraFoodShop= new Producer("ExtraFoodShop");
        extraFoodShop.addProducts("Apple", 5);
        extraFoodShop.addProducts("Orange", 8);
        producers.add(extraFoodShop);

        Order apples = new Order(extraFoodShop,producers, "Apple",5);
        System.out.println(apples.newOrder());

        Order lemons = new Order(extraFoodShop, producers, "Lemon",5);
        System.out.println(lemons.newOrder());


    }
}
