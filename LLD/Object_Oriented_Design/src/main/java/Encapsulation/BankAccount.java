package Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    // not recommended
//    public double balance;
//    public String accountNumber;



    private double balance;
    private String accountNumber;
    private List<String> transactionLogs;


    public BankAccount(String _accountNumber, double _initialBalance){
        if(_initialBalance < 0){
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = _initialBalance;
        this.accountNumber = _accountNumber;
        this.transactionLogs = new ArrayList<>();
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }

        balance += amount;
        transactionLogs.add("Deposited : "+ amount);
    }

    public void withdraw(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if(amount > balance){
            throw new IllegalArgumentException("Withdrawal amound can not exceed the account balance");
        }
         balance -= amount;
        transactionLogs.add("Withdrawn : "+amount+". New balance : "+ balance);

    }

    public List<String> getTransactionLogs(){

        // If we return the same transaction log list, the caller function/class can empty it on their own
        // which again defeats the purpose of encapsulation
//        return transactionLogs;
        return new ArrayList<>(transactionLogs);
    }




}
