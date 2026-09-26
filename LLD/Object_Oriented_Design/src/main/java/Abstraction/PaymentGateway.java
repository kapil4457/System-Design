package Abstraction;

public interface PaymentGateway {
    boolean processPayment(double amount, String currency);
    String getTransactionStatus(String transactionId);
}
