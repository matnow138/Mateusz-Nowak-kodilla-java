package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Producer {
    final private String name;
    final private Map<String, Integer> products = new HashMap<>();


    public Producer(final String name) {
        this.name = name;

    }

    public void addProducts(String productName, Integer quantity) {
        products.put(productName, quantity);

    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public boolean process(Producer producer, String itemName, Integer quantity) {

        Map<String, Integer> products = producer.getProducts();
        if (products.containsKey(itemName)) {

            return products.get(itemName) >= quantity;
        }

        return false;
    }

}
