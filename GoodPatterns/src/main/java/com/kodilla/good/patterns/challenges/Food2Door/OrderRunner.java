package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class OrderRunner {
    private final List<Producer> producers = new ArrayList<>();

    public static void main(String[] args) {

        OrderRunner orderRunner = new OrderRunner();
        orderRunner.addProducer("ExtraFoodShop");
        orderRunner.addProducts("ExtraFoodShop");

        OrderPlacement orderPlacement = new OrderPlacement();
        System.out.println(orderPlacement.process(orderRunner, "ExtraFoodShop", "Apple", 3));
        System.out.println(orderPlacement.process(orderRunner, "ExtraFoodShop", "Lemon", 3));
    }

    public void addProducer(String name) {
        producers.add(new Producer(name));
    }

    public int getIndex(String producerName) {
        for (int i = 0; i <= producers.size(); i++) {
            Producer producer = producers.get(i);
            if (producerName.equals(producer.getName())) {
                return i;
            }
        }
        return -2;
    }

    public void addProducts(String producerName) {
        int index = getIndex(producerName);
        producers.get(index).addProducts("Apple", 6);
        producers.get(index).addProducts("Orange", 5);
    }

    public List<Producer> getProducers() {
        return producers;
    }
}
