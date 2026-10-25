package Decorator.Provider;


import Decorator.IProvider;

import java.util.List;

public class OpenAIProvider implements IProvider {
    @Override
    public String execute(String prompt) {
        return "Generating response via OpenAI Provider";
    }

    @Override
    public List<String> getCitations(String response) {
        return List.of("OPENAI-CT-1");
    }
}
