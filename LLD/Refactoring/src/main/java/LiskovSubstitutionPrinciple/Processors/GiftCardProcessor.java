package LiskovSubstitutionPrinciple.Processors;

import LiskovSubstitutionPrinciple.IPaymentProcessor;

public class GiftCardProcessor implements IPaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Payment via Gift Card. Amount: "+amount);
    }
}
