package com.kodilla.good.patterns.challenges.Food2Door;

public interface Order {
    boolean process(OrderRunner orderRunner, String productName, String itemName, Integer quantity);
}
