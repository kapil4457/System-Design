package Composition;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private double baseSalary;
    private List<BonusStrategy> bonusStrategy;

    public Employee(String _name, double _baseSalary){
        this.name = _name;
        this.baseSalary = _baseSalary;
        this.bonusStrategy = new ArrayList<>();
    }


    public void addBonusStrategy(BonusStrategy bonusStrategy) {
        this.bonusStrategy.add(bonusStrategy);
    }

    public void printPaySlip(){
        double bonus = 0;
        for(int i = 0; i < bonusStrategy.size(); i++){
            bonus+= bonusStrategy.get(i).calculateBonus(baseSalary);
        }
        System.out.println("Payslip for "+name);
        System.out.println("Base Salary : "+baseSalary + " | Bonus: "+bonus);

    }
}



/*

"N" different bonus strategies
"M" different types of roles

"N" different bonus strategies
-> we can just accept the differnt strategies as a member variable in a single type of Employee


N+1 -> different classes

 */