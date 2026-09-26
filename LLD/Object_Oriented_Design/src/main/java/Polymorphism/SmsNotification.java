package Polymorphism;

public class SmsNotification extends Notification {
    public SmsNotification(String recipient){
        super(recipient);
    }

    @Override
    public void send(String message){
        System.out.println("Sending SMS notification to "+this.recipient+". Message : "+message);
        // internally calls Twillio API, and handle the character limits, etc
    }
}
