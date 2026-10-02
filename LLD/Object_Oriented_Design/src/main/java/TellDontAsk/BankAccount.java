package TellDontAsk;

public class BankAccount {

    private double balance;
    private boolean isPremium;

    public BankAccount(double _balance, boolean _isPremium){
        this.balance = _balance;
        this.isPremium = _isPremium;
    }


    public double getBalance(){
        return this.balance;
    }

    public void withdraw(double amount){
        double overdraftLimit = isPremium ? 500 : 0;


        if(balance - amount < -overdraftLimit){
            throw new IllegalStateException("Insufficient Funds");
        }

        balance-=amount;
        System.out.println("Withdrawal successfully");

    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Amount "+amount+" deposited into the account");
    }


    // Non-standard approach
    public void setBalance(double newBalance){
        this.balance = newBalance;
    }





}
