package Cohesion.High_Cohesion;

public class OrderCheckoutOrchestrator {
    private EmailNotifier emailNotifier = new EmailNotifier();
    private InventoryService inventoryService = new InventoryService();
    private InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
    private OrderService orderService = new OrderService();
    private PaymentService paymentService = new PaymentService();
    private TaxCalculator taxCalculator = new TaxCalculator();

    public void checkout(String orderId, String productId, int quantity, double amount, String email){

        orderService.createOrder(productId, quantity);
        double tax = taxCalculator.calculateTax(amount);
        paymentService.processPayment(amount+tax,orderId);
        inventoryService.updateInventoryStock(productId,quantity);
        invoiceGenerator.generatePdfInvoice(orderId);
        emailNotifier.sendEmailConfirmation(email);

        System.out.println("Checkout completed!");

    }
}
