package Cohesion.High_Cohesion;


// Informal definition : Be a master of one rather than jack of all trade.
public class Cohesion {
    public static void main(String[] args) {
        OrderCheckoutOrchestrator orchestrator = new OrderCheckoutOrchestrator();
        orchestrator.checkout("ORD-001","PRD-001",2,500,"abcd@test.com");
    }
}
