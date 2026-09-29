package Cohesion.High_Cohesion;

public class InventoryService {
    public void updateInventoryStock(String productId, int quantity){
        System.out.println("Reducing the quantity of product with ID: "+productId+" by "+quantity);
    }
}
