package LiskovSubstitutionPrinciple;

import LiskovSubstitutionPrinciple.Processors.CreditCardProcessor;
import LiskovSubstitutionPrinciple.Processors.GiftCardProcessor;

public class Main {
    public static void main(String[] args) {

        // Vialotion of LSP
//        PaymentProcessor creditCard = new CreditCardProcessor();
//        PaymentProcessor giftCard = new GiftCardProcessor();
//
//        creditCard.processPayment(300);
//        giftCard.processPayment(300);
//
//        creditCard.refundPayment(300);
//        giftCard.refundPayment(300);



        // Way 2: Abiding to LSP

        IPaymentProcessor creditCardProcessor = new CreditCardProcessor();
        IPaymentProcessor giftCardProcessor = new GiftCardProcessor();

        Refundable creditCardRefundable = new CreditCardProcessor();
//        Refundable giftCardRefundable = new GiftCardProcessor(); // --> Now, Gift cards do not even support refunds

        creditCardProcessor.processPayment(300);
        creditCardRefundable.refund(300);

        giftCardProcessor.processPayment(300);






    }


    public void checkout(PaymentProcessor processor, double amount){
        processor.processPayment(amount);
    }

    public void refund(Refundable refundable, double amount){
        refundable.refund(amount);
    }
}


/*

- We should not strengthen preconditions.
- We should not weaken the postconditions imposed by the parent class.
-We should maintain/preserve invariants.

 */
