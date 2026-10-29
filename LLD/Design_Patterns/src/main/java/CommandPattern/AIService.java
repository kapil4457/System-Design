package CommandPattern;

public class AIService {

    public String generateResponse(String question){
        return "Generating Response for: "+question;
    };
    public String summarize(String context){
        return "Summarizing for context: "+context;
    };
    public String clearHistory(String conversationId){
        return "Clearing history for id: "+conversationId;
    }

}
