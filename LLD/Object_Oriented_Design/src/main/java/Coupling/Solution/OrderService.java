package Coupling.Solution;

// Loose Coupling  = not bound to something permanently but rather
// flexible to use any or be adaptable to any other implementation of the same functionality group
public class OrderService {

    private NotificationSender notificationSender;

    public OrderService(NotificationSender _notificationSender){
        this.notificationSender = _notificationSender;
    }

    public void placeOrder(String productId, String customerContact){
        System.out.println("Order placed for "+ customerContact);
        notificationSender.send(customerContact, "Your order for "+ productId+" has been placed successfully");
    }
}

/*

Abstraction vs Coupling

-> The quality or the feature of the code to hide the implementation is called abstraction
-> The quality or the feature of the code to be adaptable to different implementations of a certain type of functionality and not be dependent / tightly bound to one implementation is called coupling ( loose coupling )


 */