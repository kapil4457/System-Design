package LawOfDemeter;

public class Order {

    private Customer customer;

    public Order(Customer _customer){
        this.customer = _customer;
    }

    public String getCustomerZipCode(){
        return customer.getZipCode();
    }
}
