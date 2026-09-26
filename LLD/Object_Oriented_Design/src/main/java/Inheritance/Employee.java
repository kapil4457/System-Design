package Inheritance;

public class Employee
{
    protected String name;
    protected String employeedId;
    protected double baseSalary;

    public Employee(String _name, String _employeeId, double _baseSalary){
        this.name = _name;
        this.employeedId = _employeeId;
        this.baseSalary = _baseSalary;
    }


    public void checkIn(){
        System.out.println(this.name  + " checked in at 09:00 AM");
    }

    public double calculateBonus(){
        return baseSalary * 0.05; // default to 5% bonus
    }

    public void printPayslip(){
        double bonus = calculateBonus();
        System.out.println("========= Payslip for "+this.name+" =========");
        System.out.println("Base salary: "+this.baseSalary);
        System.out.println("Bonus: "+ bonus);
        double total = baseSalary + bonus;
        System.out.println("Total: " + total);
    }
}
