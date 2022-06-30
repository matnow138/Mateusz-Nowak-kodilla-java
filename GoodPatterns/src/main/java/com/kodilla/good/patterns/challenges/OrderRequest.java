package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private User user;

    public OrderRequest(final User user){
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
