package Abstraction;

public class RazorpayPaymentGateway implements  PaymentGateway{
    @Override
    public boolean processPayment(double amount, String currency) {
        System.out.println("Razorpay: Connecting to Razorpay");
        System.out.println("Razorpay: Getting the clientId and clientPassword from the configuration manager.");
        System.out.println("Razorpay: Sending the request to payment gateway");
        System.out.println("Razorpay: Payment of "+amount+" "+ currency+" processed via Razorpay");
        return true;
    }

    @Override
    public String getTransactionStatus(String transactionId) {
        return "Razorpay: SUCCESS for transaction ID "+transactionId;
    }
}
