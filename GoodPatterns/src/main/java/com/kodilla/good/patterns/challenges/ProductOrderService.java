package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private OrderService orderService;
    private InformationService informationService;
    private OrderRepository orderRepository;
    private Item item;

    public ProductOrderService(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository, Item item){
        this.informationService=informationService;
        this.orderService=orderService;
        this.orderRepository=orderRepository;
        this.item = item;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isBought = orderService.order(orderRequest.getUser());
        if(isBought) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), item);
            return new OrderDto(orderRequest.getUser(),true);
        }else{
            return new OrderDto(orderRequest.getUser(),false);
        }

    }

    public static void main(String args[]){
        User user = new User("Jan","Kowalski","Poznań","jan.kowalski@mail.com","123456789");

       OrderRequest orderRequest = new OrderRequest(user);






    }

}
