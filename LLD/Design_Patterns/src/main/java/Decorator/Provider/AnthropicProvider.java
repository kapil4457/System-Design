package Decorator.Provider;


import Decorator.IProvider;

import java.util.List;

public class AnthropicProvider implements IProvider {
    @Override
    public String execute(String prompt) {
        return "Generating response via Anthropic Provider";
    }

    @Override
    public List<String> getCitations(String response) {
        return List.of("ANTHROPIC-CT-1");
    }

}




