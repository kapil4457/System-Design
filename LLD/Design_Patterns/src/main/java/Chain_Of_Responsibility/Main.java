package Chain_Of_Responsibility;

import Chain_Of_Responsibility.Handlers.AIExecutionHandler;
import Chain_Of_Responsibility.Handlers.AuthenticationHandler;
import Chain_Of_Responsibility.Handlers.SafetyHandler;
import Chain_Of_Responsibility.Handlers.ValidationHandler;

public class Main {
    public static void main(String[] args) {

        AIRequestHandler validation = new ValidationHandler();
        AIRequestHandler authentication = new AuthenticationHandler(true);
        AIRequestHandler safety = new SafetyHandler();
        AIRequestHandler execution = new AIExecutionHandler();

        validation.setNext(authentication).setNext(safety).setNext(execution);
        validation.handle("Explain what is the difference between LLD and HLD.");
        System.out.println("=======================");
        validation.handle("This is the blocked content prompt.");
    }
}
