package Cohesion;


/*


- Creates an order
- Calculates the tax
- Generates Invoices
- Sends Confirmation email
- Updates Inventory Stock
- Payment Processing

 */
public class Low_Cohesion_OrderManager {
    public void createOrder(String productId, int quantity){
        System.out.println("Creating an order for product with ID: "+productId + " and quantity of: "+quantity);
    }

    public void calculateTax(double amount){
        System.out.println("Calculating tax for amount: "+amount);
    }

    public void sendEmailConfirmation(String email){
        System.out.println("Sending email confirmation to: "+email);
    }

    public void generatePdfInvoice(String orderId){
        System.out.println("Generating invoice for order with ID: "+orderId);
    }

    public void updateInventoryStock(String productId, int quantity){
        System.out.println("Reducing the quantity of product with ID: "+productId+" by "+quantity);
    }

    public void processPayment(double amount, String orderId){
        System.out.println("Processing payment of "+amount+" for order with ID: "+orderId);
    }

}
