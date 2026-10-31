package CodeSmellAndRefactoring;


// Technique: Replacing conditionals with Polymorphism
public class DiscountService {

    public double calculateDiscount(DiscountType discountType, double amount){
        return discountType.calculateDiscount(amount);
    }


    public interface DiscountType{
        double calculateDiscount(double amount);
    }

    private class RegularDiscount implements  DiscountType{

        @Override
        public double calculateDiscount(double amount) {
            return amount*0.05;
        }
    }

    private class PremiumDiscount implements  DiscountType{

        @Override
        public double calculateDiscount(double amount) {
            return amount*0.10;
        }
    }

    private class VipDiscount implements  DiscountType{

        @Override
        public double calculateDiscount(double amount) {
            return amount*0.20;
        }
    }

    private class CorporateDiscount implements DiscountType{

        @Override
        public double calculateDiscount(double amount) {
            return amount * 0.25;
        }
    }


}



