package Chain_Of_Responsibility.Handlers;

import Chain_Of_Responsibility.AIRequestHandler;

public class ValidationHandler extends AIRequestHandler {
    @Override
    public boolean process(String prompt) {
        if(prompt == null || prompt.isBlank()){
            System.out.println("Prompt can not be empty...");
            return false;
        }

        System.out.println("Validation passed.");
        return true;
    }
}
