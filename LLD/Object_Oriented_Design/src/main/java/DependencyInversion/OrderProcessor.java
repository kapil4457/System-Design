package DependencyInversion;


// High Level - Business Logic
public class OrderProcessor {
    private OrderRepository repository;

    public OrderProcessor(OrderRepository _orderRepository){
        this.repository = _orderRepository;
    }

    public void processOrder(String orderId, double amount){
        System.out.println("Processing order "+orderId);
        repository.save(orderId,amount);

    }
}
