package Inheritance;

public class EngineerEmployee extends Employee{

    private int codeReviewCompleted;

    public EngineerEmployee(String _name, String _employeeId, double _baseSalary, int _codeReviewCompelted){
        super(_name,_employeeId,_baseSalary);
        this.codeReviewCompleted = _codeReviewCompelted;
    }

    @Override
    public double calculateBonus(){
        return baseSalary * 0.10 + (codeReviewCompleted * 50);
    }
}
