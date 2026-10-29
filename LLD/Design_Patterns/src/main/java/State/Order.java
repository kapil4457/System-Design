package State;

import State.States.PendingState;

import java.util.Objects;

public class Order {




    // Way 1: Old way - not maintainable with growing number of states
//    private String state = "PENDING";
//
//    public void pay(){
//        if(Objects.equals(state, "PENDING")){
//            System.out.println("Payment Successful.");
//            state = "PAID";
//        }else{
//            System.out.println("Payment not allowed.");
//        }
//    }
//
//    public void ship(){
//        if(Objects.equals(state, "PAID")){
//            System.out.println("Order Shipped.");
//            state = "SHIPPED";
//        }else{
//            System.out.println("Order can not be shipped.");
//        }
//    }
//
//    public void deliver(){
//        if(Objects.equals(state, "SHIPPED")){
//            System.out.println("Order Delivered.");
//            state = "PAID";
//        }else{
//            System.out.println("Order Delivery not allowed.");
//        }
//    }



    // Way 2: Using state classes

    private OrderState state = new PendingState();

    public void setState(OrderState _state){
        this.state = _state;
    }

    public void pay(){
        state.pay(this);
    }

    public void ship(){
        state.ship(this);
    }

    public void deliver(){
        state.deliver(this);
    }
}
