package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;
import java.util.Map;

public class OrderPlacement implements Order {


    public boolean process(OrderRunner orderRunner, String producerName, String itemName, Integer quantity) {

        List<Producer> producers = orderRunner.getProducers();

        Map<String, Integer> products = producers.get(orderRunner.getIndex(producerName)).getProducts();
        if (products.containsKey(itemName)) {

            return products.get(itemName) >= quantity;
        }

        return false;
    }


}
