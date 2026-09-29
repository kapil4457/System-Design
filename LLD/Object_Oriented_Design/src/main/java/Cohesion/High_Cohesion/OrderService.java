package Cohesion.High_Cohesion;

public class OrderService {
    public void createOrder(String productId, int quantity){
        System.out.println("Creating an order for product with ID: "+productId + " and quantity of: "+quantity);
    }
}
