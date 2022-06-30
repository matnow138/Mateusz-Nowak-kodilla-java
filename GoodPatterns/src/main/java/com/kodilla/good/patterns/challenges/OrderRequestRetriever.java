package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        User user = new User("Jan", "Kowalski", "Poznań","jan.kowalski@mail.com","123456789");
        return new OrderRequest(user);
    }


}
