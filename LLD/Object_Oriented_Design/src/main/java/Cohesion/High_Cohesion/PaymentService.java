package Cohesion.High_Cohesion;

public class PaymentService {
    public void processPayment(double amount, String orderId){
        System.out.println("Processing payment of "+amount+" for order with ID: "+orderId);
    }
}
