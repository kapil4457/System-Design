package Abstraction;

public class CheckoutService {
    private PaymentGateway paymentGateway; //  <- encapsulation here

    public CheckoutService(PaymentGateway _paymentGateway){
        this.paymentGateway = _paymentGateway;
    }

    public void checkout(double amount, String currency){
        System.out.println("Initiating the checkout process....");
        boolean status = paymentGateway.processPayment(amount,currency);
        if(status){
            System.out.println("Order places successfully");
        }else{
            System.out.println("Payment failed. Try using some other method.");
        }
    }

    public String getStatus(String transactionId){
        return this.paymentGateway.getTransactionStatus(transactionId);
    }
}
