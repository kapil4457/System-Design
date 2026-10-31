package OpenClosedPrinciple.Providers;

import OpenClosedPrinciple.AIProvider;

public class AnthropicProvider implements AIProvider {
    @Override
    public String generateResponse(String question) {
        return "Response from ANTHROPIC for the question: "+question;
    }
}
