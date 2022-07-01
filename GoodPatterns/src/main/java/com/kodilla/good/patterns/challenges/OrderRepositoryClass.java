package com.kodilla.good.patterns.challenges;

public class OrderRepositoryClass implements OrderRepository{
    @Override
    public void createOrder(User user, Item item) {
        System.out.println("well done, you bought it!");
    }
}
