package DependencyInversionPrinciple.Providers;

import DependencyInversionPrinciple.AIProvider;

public class OpenAIProvider implements AIProvider {
    @Override
    public String generate(String prompt) {
        return "Response generated via OpenAI Provider for question: "+prompt;
    }
}

