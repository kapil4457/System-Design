package Abstraction;


// comparable to the PaymentGateway interface
public abstract class AbstractedPaymentGateway {

    public abstract  boolean processPayment(double amount, String currency);
    public abstract String getTransactionStatus(String transactionId);


    //common
    public void transactionInitializer(double amount){
        System.out.println("Attempting transaction of amount "+amount);
    }
}

// comparable to the stripe payment gateway
class AbstractedStripeGateway extends AbstractedPaymentGateway{

    @Override
    public boolean processPayment(double amount, String currency) {
        System.out.println("Processing payment via abstracted stripe gateway");
        return true;
    }

    @Override
    public String getTransactionStatus(String transactionId) {
        System.out.println("Transaction success from abstracted stripe gateway");
        return "";
    }
}

// comparable to the razorpay payment gateway
class AbstractedRazorpayGateway extends AbstractedPaymentGateway{

    @Override
    public boolean processPayment(double amount, String currency) {
        System.out.println("Processing payment via abstracted razorpay gateway");
        return true;
    }

    @Override
    public String getTransactionStatus(String transactionId) {
        System.out.println("Transaction success from abstracted razorpay gateway");
        return "";
    }
}

// Comparable to the Checkout Service
class AbstractedCheckoutService{
    AbstractedPaymentGateway paymentGateway;

    public AbstractedCheckoutService(AbstractedPaymentGateway _paymentGateway){
        this.paymentGateway = _paymentGateway;
    }


    public void checkout(double amount, String currency){
        this.paymentGateway.transactionInitializer(amount);
        this.paymentGateway.processPayment(amount, currency);
    }

    public String getTransactionStatus(String transactionId){
        return this.paymentGateway.getTransactionStatus(transactionId);
    }
}