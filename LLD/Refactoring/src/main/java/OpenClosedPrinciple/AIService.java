package OpenClosedPrinciple;

public class AIService {

    public String generateResponse(AIProvider provider, String question){
        return provider.generateResponse(question);
    }

}
