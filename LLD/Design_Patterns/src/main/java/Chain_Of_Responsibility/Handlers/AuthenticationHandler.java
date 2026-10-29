package Chain_Of_Responsibility.Handlers;

import Chain_Of_Responsibility.AIRequestHandler;

public class AuthenticationHandler extends AIRequestHandler {

    private final boolean authenticated;

    public AuthenticationHandler(boolean _authenticated){
        this.authenticated = _authenticated;
    }


    @Override
    public boolean process(String prompt) {

        if(!authenticated){
            System.out.println("Rejected: Please login to continue.");
            return false;
        }
        System.out.println("User authentication passed.");
        return true;
    }
}
