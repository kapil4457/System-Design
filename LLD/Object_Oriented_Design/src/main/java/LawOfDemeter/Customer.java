package LawOfDemeter;

public class Customer {

    private Address address;

    public Customer(Address _address){
        this.address = _address;
    }

    public String getZipCode(){
        return address.getZipCode();
    }
}
