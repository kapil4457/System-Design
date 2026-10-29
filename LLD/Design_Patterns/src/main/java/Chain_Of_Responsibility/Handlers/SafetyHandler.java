package Chain_Of_Responsibility.Handlers;

import Chain_Of_Responsibility.AIRequestHandler;

public class SafetyHandler extends AIRequestHandler {
    @Override
    public boolean process(String prompt) {
        if(prompt.toLowerCase().contains("blocked content")){
            System.out.println("Rejected: Unsafe prompt");
            return false;
        }

        System.out.println("Safety checks passed.");
        return true;
    }
}
