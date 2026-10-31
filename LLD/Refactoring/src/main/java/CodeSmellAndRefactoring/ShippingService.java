package CodeSmellAndRefactoring;


// Technique: Introducing Parameter Object
public class ShippingService {

    public void createShippingLabel(
            String customerName,
            Address address
    ){


            // Generates the shipping label using the incoming data

    }


    private class Address{
        private final String street;
        private final String city;
        private final String state;
        private final String postalCode;
        private final String country;

        public Address(String _street, String _city, String _state, String _postalCode, String _country){
            this.street = _street;
            this.city = _city;
            this.country = _country;
            this.state = _state;
            this.postalCode = _postalCode;
        }

    }
}
