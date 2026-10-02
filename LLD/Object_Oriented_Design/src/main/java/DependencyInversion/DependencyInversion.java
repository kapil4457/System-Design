package DependencyInversion;

public class DependencyInversion {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor(new MySQLOrderRepository());
//        OrderProcessor orderProcessor = new OrderProcessor(new PostgreSQLOrderRepository());
        orderProcessor.processOrder("ORD-101", 500);
    }
}


/*

// Current Implementation :
Order Processor -> MYSQLOrderRepoitory
Order Processor -> PostgreSQLOrderRepoitory
Order Processor -> MongoDBOrderRepoitory

Problem -> Whenever the Order Repository changes, we need to touch the Order Processor



// New/Fixed Implementation :

[ MYSQLOrderRepository , PostgreSQLOrderRepository , MongoDBOrderRepository ]

                     |
                    V
            OrderRepository
                ^
                |
          Order Processor

 */