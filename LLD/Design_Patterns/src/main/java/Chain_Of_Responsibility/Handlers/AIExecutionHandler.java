package Chain_Of_Responsibility.Handlers;

import Chain_Of_Responsibility.AIRequestHandler;

public class AIExecutionHandler extends AIRequestHandler {
    @Override
    public boolean process(String prompt) {
        System.out.println("Sending prompt to AI Gateway: "+prompt);
        return true;
    }
}
