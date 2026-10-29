package Chain_Of_Responsibility;

public class AIService {

    private class User{
        private boolean isAuthenticated(){return true;}
        private boolean isRateLimited(){return true;}
    }

    public String execute(User user , String prompt){
            if(prompt == null || prompt.isBlank()){
                throw new IllegalArgumentException("Prompt can not be empty...");
            }

            if(!user.isAuthenticated()){
                throw new SecurityException("Please log in to continue.");
            }

            if(containsBlockedContent(prompt)){
                throw new IllegalArgumentException("Prompt violates the security checks.");
            }

            if(user.isRateLimited()){
                throw new IllegalStateException("Rate limit exceeded. Please try again in some time.");
            }

            return generateResponse(prompt);

    }


    private boolean containsBlockedContent(String prompt){
        return false;
    }


    private String generateResponse(String prompt){
        return "Response for: "+prompt;
    }
}
