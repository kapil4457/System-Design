package LawOfDemeter;

public class Address {
    private String street;
    private String zipCode;

    public Address(String _street, String _zipCode){
        this.street = _street;
        this.zipCode = _zipCode;
    }


    public String getZipCode(){
        return this.zipCode;
    }
}
