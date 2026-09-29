package Coupling.Problematic;

public class EmailNotifier {
    /*
        - SMPT Server details
        - Retry loop count

     */
    public void sendEmail(String to, String body){
        System.out.println("Sending an email to: "+to+" with body: "+body);
    }
}
