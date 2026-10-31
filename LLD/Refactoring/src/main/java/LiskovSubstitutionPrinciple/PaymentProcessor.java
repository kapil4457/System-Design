package LiskovSubstitutionPrinciple;

public class PaymentProcessor {

    public void processPayment(double amount){
        System.out.println("Processing amount: "+amount);
    }

    public void refundPayment(double amount){
        System.out.println("Refunding amount: "+amount);
    }
}
