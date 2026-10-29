package State.States;

import State.Order;
import State.OrderState;

public class PaidState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("Order already paid");
    }

    @Override
    public void ship(Order order) {
        order.setState(new ShippedState());
        System.out.println("Order Shipped.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Cannot deliver an un-shipped order.");
    }
}
