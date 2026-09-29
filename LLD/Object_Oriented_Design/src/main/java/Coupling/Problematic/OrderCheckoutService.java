package Coupling.Problematic;

public class OrderCheckoutService {
    private EmailNotifier emailNotifier = new EmailNotifier();

    public void placeOrder(String productId, String customerEmail){
        System.out.println("Order placed for "+productId);
        emailNotifier.sendEmail(customerEmail,"Your order has been placed for product with Id: "+productId);
    }
}
