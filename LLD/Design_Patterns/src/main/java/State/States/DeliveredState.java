package State.States;

import State.Order;
import State.OrderState;

public class DeliveredState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("Order already delivered.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Order already Delivered.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Order already Delivered.");
    }
}
