package DependencyInversion;

// MYSQL Database Integration with Order Service
// Low level
public class MySQLOrderRepository implements OrderRepository{


    @Override
    public void save(String orderId, double amount){
        System.out.println("Saving order with ID: "+orderId+" of amount: "+amount);
    }
}



