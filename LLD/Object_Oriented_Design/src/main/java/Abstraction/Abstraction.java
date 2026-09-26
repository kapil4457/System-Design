package Abstraction;



// Informal definition : Protecting/Isolating the implementation from external/outside access
public class Abstraction {
    public static void main(String[] args) {



        // Pure Abstraction
//        System.out.println("Performing transaction 1");
//        CheckoutService checkoutService = new CheckoutService(new StripePaymentGateway());
//        checkoutService.checkout(1000, "INR");
//        String status = checkoutService.getStatus("tranId-1");
//        System.out.println(status);
//
//
//        System.out.println("#####################################################");
//        System.out.println("Performing transaction 2");
//        checkoutService = new CheckoutService(new RazorpayPaymentGateway());
//        checkoutService.checkout(1500,"USD");
//        checkoutService.getStatus("tranId-2");
//        status = checkoutService.getStatus("tranId-1");
//        System.out.println(status);


        // Partial  Abstraction
        AbstractedCheckoutService checkoutService = new AbstractedCheckoutService(new AbstractedStripeGateway());
        checkoutService.checkout(1000,"INR");
        checkoutService.getTransactionStatus("tranId-1");

        System.out.println("########################");

        checkoutService = new AbstractedCheckoutService(new AbstractedRazorpayGateway());
        checkoutService.checkout(100,"USD");
        checkoutService.getTransactionStatus("tranId-1");


    }
}



/*
    Company
        -> Wallet team (Integration team)
            -> manages Abstraction
            -> manages CheckoutService
        -> Stripe Payment Gateway team [ works only on the stripe implementations ]
            -> manages StripePaymentGateway
        -> Razorpay Payment Gateway team [ works only on the razorpay implementations ]
            -> RazorpayPaymentGateway



* */