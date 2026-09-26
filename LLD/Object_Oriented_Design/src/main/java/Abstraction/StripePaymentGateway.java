package Abstraction;

import java.sql.SQLOutput;

public class StripePaymentGateway implements PaymentGateway {
    @Override
    public boolean processPayment(double amount, String currency) {
        System.out.println("Stripe: Connecting to Stripe");
        System.out.println("Stripe: Creating an access token");
        System.out.println("Stripe: Converting to the supported/smallest currency that stripe supports");
        System.out.println("Stripe: Signing the request");
        System.out.println("Stripe: Sending the request to payment gateway");
        System.out.println("Stripe: Payment of "+amount+" "+ currency+" processed via Stripe");
        return true;
    }

    @Override
    public String getTransactionStatus(String transactionId) {
        return "Stripe: SUCCESS for transaction ID "+transactionId;
    }
}
