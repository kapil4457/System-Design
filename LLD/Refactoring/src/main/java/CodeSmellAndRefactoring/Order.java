package CodeSmellAndRefactoring;


// Refactoring using "Extract Class" technique
public class Order {

    private String customerName;
    private String customerEmail;

    private Address address;


    private List<OrderItem> orderItems;

    public double calculateTotal(){
        // logic to calculate the total;

        return 0;
    }






    class Address{
        private String street;
        private String city;
        private String state;
        private String postalCode;

        public String getFullAddress(){
            return street + "," + city + "," + state;
        }

        public void sendShippingDetails(){
            // logic to send shipping details to delivery partner
        }
    }
}
