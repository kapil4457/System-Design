package Composition;

public class SalesBonusStrategy implements  BonusStrategy{
    private double salesTarget;
    private double saleAchieved;

    public SalesBonusStrategy(int _salesTarget, int _salesAchieved ){
        this.salesTarget= _salesTarget;
        this.saleAchieved = _salesAchieved;
    }
    @Override
    public double calculateBonus(double baseSalary) {
        double achievementRatio = saleAchieved/salesTarget;
        if(achievementRatio >=1.0){
            return baseSalary * 0.20; // overridden bonus of 20%
        }
        return baseSalary * 0.05;
    }
}
