package com.kodilla.good.patterns.challenges;

public class OrderService {
    public boolean order(final User user){
        System.out.println("Order to: "+ user.getName() + " " + user.getSurname() + " Address: " + user.getAddress());

        return true;
    }
}
