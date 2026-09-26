package Polymorphism;

public class PushNotification extends Notification{

    public PushNotification(String recipient){
        super(recipient);
    }

    @Override
    public void send(String message){
        System.out.println("Sending Push notification to "+this.recipient+". Message : "+message);

        // internally hits the API'S and handles device tokens, etc
    }
}
