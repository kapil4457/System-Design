package Polymorphism;

public class EmailNotification extends Notification{

    public EmailNotification(String recipient){
        super(recipient);
    }

    @Override
    public void send(String message){
        System.out.println("Sending Email notification to "+this.recipient+". Message : "+message);
        // internally connects to the SMTP server, builds the MIME message, etc, or it can call services like resend directly with the template.
    }
}
