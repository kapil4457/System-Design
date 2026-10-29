package State.States;

import State.Order;
import State.OrderState;

import java.sql.SQLOutput;

public class ShippedState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("Order already paid.");

    }

    @Override
    public void ship(Order order) {
        System.out.println("Order already shipped.");
    }

    @Override
    public void deliver(Order order) {
        order.setState(new DeliveredState());
        System.out.println("Order delivered.");
    }
}
