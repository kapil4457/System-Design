package State.States;

import State.Order;
import State.OrderState;

public class PendingState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("Payment Successful.");
        order.setState(new PaidState());
    }

    @Override
    public void ship(Order order) {
        System.out.println("Cannot ship an unpaid order.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Cannot deliver an un-shipped order.");
    }
}
