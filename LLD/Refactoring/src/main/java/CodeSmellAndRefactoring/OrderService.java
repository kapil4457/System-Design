package CodeSmellAndRefactoring;


// Solved using "Extract Method"
public class OrderService {

    public void placeOrder(Order order){

        validateOrder(order);

        double total = calculateTotal(order);
        System.out.println("Order Total: "+total);

        saveOrder(order);
        sendEmailConfirmation();
    }


    private void validateOrder(Order order){
        if(order.getItems().isEmpty()){
            throw new IllegalArgumentException("Empty order items.");
        }
    }

    private double calculateTotal(Order order){
        double total = 0;
        for(OrderItem item : order.getItems()){
            total+= item.getPrice() * item.getQuantity();
        }
        return total;
    }

    private void saveOrder(Order order){
        System.out.println("Saving order");
    }

    private void sendEmailConfirmation(Order order){
        System.out.println("Sending email confirmation for your order");
    }
}
