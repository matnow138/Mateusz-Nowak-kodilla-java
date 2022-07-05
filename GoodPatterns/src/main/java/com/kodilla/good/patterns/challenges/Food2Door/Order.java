package com.kodilla.good.patterns.challenges.Food2Door;


import java.util.List;

public class Order {

    final private List<Producer> producers;
    final private String producerName;
    final private String itemName;
    final private Integer quantity;
    final private Producer producer;

    public Order(Producer producer, List<Producer> producers, String producerName, String itemName, Integer quantity) {
        this.producer = producer;
        this.producers = producers;
        this.producerName = producerName;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public boolean newOrder() {
        return producer.process(producers, producerName, itemName, quantity);

    }
}
