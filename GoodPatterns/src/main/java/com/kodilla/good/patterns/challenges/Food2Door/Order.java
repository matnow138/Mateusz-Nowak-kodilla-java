package com.kodilla.good.patterns.challenges.Food2Door;


public class Order {


    final private String itemName;
    final private Integer quantity;
    final private Producer producer;

    public Order(Producer producer, String itemName, Integer quantity) {
        this.producer = producer;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public boolean newOrder() {
        return producer.process(itemName, quantity);

    }


}
