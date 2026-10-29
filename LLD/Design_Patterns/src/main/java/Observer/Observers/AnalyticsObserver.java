package Observer.Observers;

import Observer.AIRequestObserver;

public class AnalyticsObserver implements AIRequestObserver {
    @Override
    public void onRequestExecution(String prompt, String response) {
        System.out.println("Recording the request metrics....");
    }
}
