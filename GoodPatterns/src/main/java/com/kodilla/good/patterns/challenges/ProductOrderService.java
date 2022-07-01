package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private OrderService orderService;
    private InformationService informationService;

    public ProductOrderService(final InformationService informationService){
        this.informationService=informationService;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isBought = orderService.order(orderRequest.getUser());
        if(isBought) {
            informationService.inform(orderRequest.getUser());
            //TODO CarRentalService
            return new OrderDto(orderRequest.getUser(),true);
        }else{
            return new OrderDto(orderRequest.getUser(),false);
        }

    }

    public static void main(String args[]){
       OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
       OrderRequest orderRequest = orderRequestRetriever.retrieve();



    }

}
