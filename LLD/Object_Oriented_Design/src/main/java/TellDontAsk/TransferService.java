package TellDontAsk;

public class TransferService {

    public void transfer(BankAccount from, BankAccount to, double amount){

        // Non standard way
//        double currentBalance = from.getBalance();
//        if(currentBalance >= amount){
//            double newBalance = currentBalance-amount;
//            from.setBalance(newBalance);
//            to.setBalance(to.getBalance()+amount);
//        }



        // Standard way
        from.withdraw(amount);
        to.deposit(amount);
    }
}
