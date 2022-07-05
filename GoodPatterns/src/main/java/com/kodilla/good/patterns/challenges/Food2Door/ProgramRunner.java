package com.kodilla.good.patterns.challenges.Food2Door;

public class ProgramRunner {
    public static void main(String[] args) {

        Order order = new Order();
        Producer extraFoodShop= new Producer("ExtraFoodShop");
        extraFoodShop.addProducts("Apple", 5);
        extraFoodShop.addProducts("Orange", 8);
        order.addProducer(extraFoodShop);


       System.out.println(order.getProducers().get(order.getIndex("ExtraFoodShop")).process(order,"ExtraFoodShop", "Apple", 3));
       System.out.println(order.getProducers().get(order.getIndex("ExtraFoodShop")).process(order,"ExtraFoodShop", "Lemon", 8));

    }
}
