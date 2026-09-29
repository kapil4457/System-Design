package Coupling.Solution;

public class SmsNotification implements NotificationSender{
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending SMS message: "+message+" to "+recipient);
    }
}
