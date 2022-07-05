package com.kodilla.good.patterns.challenges.Food2Door;


import java.util.List;

public class Order {

    final private List<Producer> producers;

    final private String itemName;
    final private Integer quantity;
    final private Producer producer;

    public Order(Producer producer, List<Producer> producers,  String itemName, Integer quantity) {
        this.producer = producer;
        this.producers = producers;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public boolean newOrder() {
        return producer.process(producers.get(getIndex(producer.getName())), itemName, quantity);

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
}
