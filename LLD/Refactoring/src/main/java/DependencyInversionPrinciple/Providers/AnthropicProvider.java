package DependencyInversionPrinciple.Providers;

import DependencyInversionPrinciple.AIProvider;

public class AnthropicProvider implements AIProvider {
    @Override
    public String generate(String prompt) {
        return "Response generated via Anthropic Provider for question: "+prompt;
    }
}
