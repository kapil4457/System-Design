package LiskovSubstitutionPrinciple.Processors;

import LiskovSubstitutionPrinciple.IPaymentProcessor;
import LiskovSubstitutionPrinciple.Refundable;

public class CreditCardProcessor implements IPaymentProcessor, Refundable {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment via credit card. Amount: "+amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding payment via credit card. Amount: "+amount);
    }
}
