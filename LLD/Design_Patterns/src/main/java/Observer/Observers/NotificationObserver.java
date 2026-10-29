package Observer.Observers;

import Observer.AIRequestObserver;

public class NotificationObserver implements AIRequestObserver {
    @Override
    public void onRequestExecution(String prompt, String response) {
        System.out.println("Sending out notification...");
    }
}
