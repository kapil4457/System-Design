package Coupling.Solution;

public class EmailNotification implements NotificationSender{
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending email with message: "+message+" to "+recipient);
    }
}
