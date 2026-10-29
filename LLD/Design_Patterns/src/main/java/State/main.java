package State;

public class main {

    public static void main(String[] args) {

        // Way 1: Using the multiple if-else blocks in Order class
//        Order order = new Order();
//
//        order.deliver();
//        order.pay();
//        order.ship();
//        order.deliver();


        // Way 2: Using State classes
        Order order = new Order(); // Initially all orders are in pending state
        order.ship(); // Getting a message stating why this operation can not be done
        order.pay();
        order.ship();
        order.deliver();
    }
}
