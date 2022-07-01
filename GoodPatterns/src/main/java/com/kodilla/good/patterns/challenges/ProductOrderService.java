package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private final OrderService orderService;
    private final InformationService informationService;
    private final OrderRepository orderRepository;


    public ProductOrderService(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository){
        this.informationService=informationService;
        this.orderService=orderService;
        this.orderRepository=orderRepository;

    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isBought = orderService.order(orderRequest.getUser());
        if(isBought) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getItem());
            return new OrderDto(orderRequest.getUser(),true);
        }else{
            return new OrderDto(orderRequest.getUser(),false);
        }

    }

    public static void main(String args[]){
        User user = new User("Jan","Kowalski","Poznań","jan.kowalski@mail.com","123456789");
        Item item = new Item("Drzwi", 5);
       OrderRequest orderRequest = new OrderRequest(user, item);
       InformationServiceClass informationServiceClass = new InformationServiceClass();
       OrderServiceClass orderServiceClass = new OrderServiceClass();
       OrderRepositoryClass orderRepositoryClass = new OrderRepositoryClass();

       ProductOrderService productOrderService = new ProductOrderService(informationServiceClass, orderServiceClass, orderRepositoryClass);

       productOrderService.process(orderRequest);






    }

}
