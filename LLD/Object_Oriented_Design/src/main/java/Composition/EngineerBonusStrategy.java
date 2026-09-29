package Composition;

public class EngineerBonusStrategy implements BonusStrategy{

    private int codeReviewCompleted;

    public EngineerBonusStrategy(int _codeReviewCompleted){
        this.codeReviewCompleted = _codeReviewCompleted;
    }
    @Override
    public double calculateBonus(double baseSalary) {
        return baseSalary * 0.10 + (codeReviewCompleted * 50);
    }
}
