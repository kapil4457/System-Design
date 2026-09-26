package Polymorphism;

import java.util.ArrayList;
import java.util.List;


// Core Idea : Do the "same stuff" but just "change the way it is done"
    // we can "notify" the user in "different ways"
    // we can "build a message" in "different ways"
// Informal definition : Same command - different reaction
public class Polymorphism {
    public static void main(String[] args) {


        // Runtime : Abstract class
        NotificationService service = new NotificationService();

        List<Notification> notifications = new ArrayList<>();

        notifications.add(new EmailNotification("john.doe@gmail.com"));
        notifications.add(new SmsNotification("+91-1234567890"));
        notifications.add(new PushNotification("token-abc"));

        for (var notification : notifications) {
            service.notifyUser(notification, "You order has been shipped");
        }


        // Runtime : Interface
        List<Shape> shapes = List.of(new Circle(5) , new Rectangle(4,6));
        for(var shape : shapes){
            System.out.println("Area : "+shape.calculateArea());;
        }


        // Compile time
        MessageBuilder  builder = new MessageBuilder();
        System.out.println(builder.buildMessage("Hello"));
        System.out.println(builder.buildMessage("Hello","https://google.com"));
        System.out.println(builder.buildMessage("Hello",1));





    }
}
