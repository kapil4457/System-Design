package Observer;

import java.util.List;


// PRODUCER / EVENT EMITTER
public class AIRequest {

    private final List<AIRequestObserver> observers;

    public AIRequest(List<AIRequestObserver> _observers){
        this.observers = _observers;
    }
    // GOAL: Its only concern should be with generating response
    public String execute(String question){
        System.out.println("Calling the AI Gateway to generate response.....");
        // Logic below calling the AI Gateway....
        String response = "Response from AI Gateway...";

        notifyObservers(question,response);
        return response;
    }


    private void notifyObservers(String question, String response){
        for(var observer:observers){
            observer.onRequestExecution(question,response);
        }
    }

}
