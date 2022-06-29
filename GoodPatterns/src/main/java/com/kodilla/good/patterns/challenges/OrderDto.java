package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private User user;
    private boolean isAvailable;

    private int quantity;

    public OrderDto(User user, boolean isAvailable, int quantity) {
        this.user = user;
        this.isAvailable = isAvailable;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getQuantity() {
        return quantity;
    }
}
