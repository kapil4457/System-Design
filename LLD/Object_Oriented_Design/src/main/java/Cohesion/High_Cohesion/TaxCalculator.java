package Cohesion.High_Cohesion;

public class TaxCalculator {
    public double calculateTax(double amount){
        System.out.println("Calculating tax for amount: "+amount);
        return amount * 0.18; // 18%
    }
}
