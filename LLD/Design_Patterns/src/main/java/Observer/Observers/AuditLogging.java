package Observer.Observers;

import Observer.AIRequestObserver;

public class AuditLogging implements AIRequestObserver {
    @Override
    public void onRequestExecution(String prompt, String response) {
        System.out.println("Logging AI Response: "+response);
    }
}
