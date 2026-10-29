package Chain_Of_Responsibility;

public abstract class AIRequestHandler {
    private AIRequestHandler next;


    public AIRequestHandler setNext(AIRequestHandler _next){
        this.next = _next;
        return next;
    }

    public final void handle(String prompt){
            if(process(prompt) && next!=null){
                next.handle(prompt);
            }
    }

    public abstract boolean process(String prompt);


}
