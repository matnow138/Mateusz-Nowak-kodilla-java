package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
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
}
