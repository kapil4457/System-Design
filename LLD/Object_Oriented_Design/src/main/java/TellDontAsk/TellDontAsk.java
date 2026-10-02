package TellDontAsk;

public class TellDontAsk {
    public static void main(String[] args) {
        BankAccount premiumAccount = new BankAccount(500, true);
        BankAccount regularAccount = new BankAccount(500, false);

        premiumAccount.withdraw(900);
        System.out.println("Premium account balance is "+premiumAccount.getBalance());


        regularAccount.withdraw(900);
        System.out.println("Regular account balance is "+regularAccount.getBalance());

    }
}
