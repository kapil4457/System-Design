package LawOfDemeter;

public class TaxCalculator {

    public double calculateShippingTax(Order order){
        String zip = order.getCustomerZipCode();
        System.out.println("Calculating tax for zipcode: "+zip);
        return zip.startsWith("5") ? 50 : 100;
    }
}
