package Coupling.Solution;

public class Coupling {
    public static void main(String[] args) {

        // LOOSE COUPLING
        OrderService orderService = new OrderService(new EmailNotification());
        orderService.placeOrder("PRD-101", "shrey@gmail.com");

        orderService = new OrderService(new SmsNotification());
        orderService.placeOrder("PRD-102","+91 10101010101");


    }
}
