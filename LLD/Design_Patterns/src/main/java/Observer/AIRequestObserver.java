package Observer;


// CONSUMER / OBSERVER
public interface AIRequestObserver {
    void onRequestExecution(String prompt, String response);
}
