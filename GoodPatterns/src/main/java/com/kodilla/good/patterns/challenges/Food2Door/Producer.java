package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Producer {
    private String name;
    private Map<String,Integer> products = new HashMap<>();


    public Producer(String name) {
        this.name = name;

    }
    public void addProducts(String productName, Integer quantity){
        products.put(productName, quantity);

    }
    public String getName() {
        return name;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }
    public boolean process(Order orderRunner, String producerName, String itemName, Integer quantity) {

        List<Producer> producers = orderRunner.getProducers();

        Map<String, Integer> products = producers.get(orderRunner.getIndex(producerName)).getProducts();
        if (products.containsKey(itemName)) {

            return products.get(itemName) >= quantity;
        }

        return false;
    }
}
