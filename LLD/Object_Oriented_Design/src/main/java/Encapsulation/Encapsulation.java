package Encapsulation;

import java.util.List;


// Informal definition : Protecting/Isolating the member variables and their state from external/outside  access
public class Encapsulation {
    public static void main(String[] args) {

        // Not recommended
//        BankAccount account = new BankAccount();
//        account.balance = -50000;
//        account.balance = account.balance / 1000;


        BankAccount account = new BankAccount("acc-123",1000);

        double balance = account.getBalance();
        System.out.println("Initial balance : " +balance);

        account.deposit(200);
        balance = account.getBalance();
        System.out.println("New balance after deposit : " +balance);


        account.withdraw(200);
        balance = account.getBalance();
        System.out.println("New balance after withdrawal : " +balance);


        System.out.println("####################################");
        List<String> transactionLogs = account.getTransactionLogs();
        transactionLogs.clear();
        transactionLogs = account.getTransactionLogs();

        for(int i = 0 ; i < transactionLogs.size(); i++){
            System.out.println(transactionLogs.get(i));
        }

//        account.withdraw(10000); // throws exception
//        account.deposit(-1); // throws exception










    }
}
