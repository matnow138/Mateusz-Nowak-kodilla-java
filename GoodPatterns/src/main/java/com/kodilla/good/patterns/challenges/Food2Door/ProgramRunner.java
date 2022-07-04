package com.kodilla.good.patterns.challenges.Food2Door;

public class ProgramRunner {
    public static void main(String[] args) {

        Order order = new Order();
        order.addProducer("ExtraFoodShop");
        order.addProducts("ExtraFoodShop");

        // OrderPlacement orderPlacement = new OrderPlacement();
        System.out.println(Producer.process(order, "ExtraFoodShop", "Apple", 3));
        System.out.println(Producer.process(order, "ExtraFoodShop", "Lemon", 3));
    }
}
