package InterfaceSegregationPrinciple;

import InterfaceSegregationPrinciple.ProviderFunctionalities.TextGenerator;

public class ChatService {

    private final TextGenerator textGenerator;

    public ChatService(TextGenerator _textGenerator){
        this.textGenerator = _textGenerator;
    }

    public String chat(String prompt){
        return textGenerator.generateResponse(prompt);
    }
}
