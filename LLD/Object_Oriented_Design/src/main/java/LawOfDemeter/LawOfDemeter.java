package LawOfDemeter;

public class LawOfDemeter {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();
        Address address = new Address("Street-1","512345");
        Customer customer = new Customer(address);
        Order order = new Order(customer);


        double tax = calculator.calculateShippingTax(order);
        System.out.println("Tax: "+tax);




        // This is not violating to Law of Demeter
        StringBuilder sb = new StringBuilder().append("a").append("b").append("c").append("d");
        System.out.println(sb.toString());
    }
}
