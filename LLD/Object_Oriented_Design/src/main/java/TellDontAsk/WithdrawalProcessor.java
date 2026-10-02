package TellDontAsk;

public class WithdrawalProcessor {

    public void processWithdrawal(BankAccount account, double amount){


        // Non Standard way
//            // Asking account for its balance
//            double currentBalance = account.getBalance();
//
//            // Manually handling and updating the account balance.
//            //  WithdrawalProcessor handles the business logic of the BankAccount
//            if(currentBalance >= amount){
//                double newBalance = currentBalance - amount;
//                account.setBalance(newBalance);
//                System.out.println("Withdrawal successful. New account balance is "+newBalance);
//            }else{
//                System.out.println("Insufficient balance!");
//            }


        // Standard way
        account.withdraw(amount);
    }
}
