package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private int orderQuantity;

    public ProductOrderService(){

    }
    public void buyProcess(Item item, int orderQuantity, User user){
        if(orderQuantity<item.getQuantity()){
            System.out.println("You can order it!");
        }else{
            System.out.println("Insufficient quantity!");
        }

    }
    public OrderDto order(Item item){
        return null;
    }

    public static void main(String args[]){
        User user = new User("Jan", "Kowalski", "Polska", "jan.kowalski@mail.com", "123456789");

        Item item = new Item("Bike", 5);

        ProductOrderService productOrderService = new ProductOrderService();
        int quantity = 3;
        productOrderService.buyProcess(item,quantity,user);

    }

}
