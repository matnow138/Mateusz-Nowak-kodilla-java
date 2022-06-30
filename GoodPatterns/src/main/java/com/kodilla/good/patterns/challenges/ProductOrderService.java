package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private OrderService orderService;
    private InformationService informationService;

    public ProductOrderService(final InformationService informationService){
        this.informationService=informationService;
    }

    public OrderDto process(final OrderRequest orderRequest){
        informationService.inform(orderRequest.getUser());

        return new OrderDto(orderRequest.getUser(),true,1);
    }

    public static void main(String args[]){
       OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
       OrderRequest orderRequest = orderRequestRetriever.retrieve();



    }

}
