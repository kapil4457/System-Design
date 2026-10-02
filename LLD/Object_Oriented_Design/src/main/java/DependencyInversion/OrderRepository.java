package DependencyInversion;

public interface OrderRepository {
    void save(String orderId, double amount);
}
