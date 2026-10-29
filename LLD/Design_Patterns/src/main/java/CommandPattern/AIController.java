package CommandPattern;

public class AIController {

    private final AIService aiService;


    public AIController(AIService _aiService){
        this.aiService = _aiService;
    }


    public String handleRequest(String action, String input){
        return switch (action) {
            case "GENERATE" ->  aiService.generateResponse(input);
            case "SUMMARIZE" -> aiService.summarize(input);
            case "CLEAR" -> aiService.clearHistory(input);
            default -> throw new IllegalArgumentException("Operation not supported");
        };
    }
}
