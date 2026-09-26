package Inheritance;

public class SalesEmployee extends Employee{

    private double salesTarget;
    private double saleAchieved;

    public SalesEmployee(String _name, String _employeeId, double _baseSalary, double _salesTarget, double _salesAchieved){
        super(_name, _employeeId, _baseSalary);
        this.salesTarget= _salesTarget;
        this.saleAchieved = _salesAchieved;
    }

    @Override
    public double calculateBonus(){
        double achievementRatio = saleAchieved/salesTarget;
        if(achievementRatio >=1.0){
            return baseSalary * 0.20; // overridden bonus of 20%
        }
        return baseSalary * 0.05;
    }

}
