package OpenClosedPrinciple.Providers;

import OpenClosedPrinciple.AIProvider;

public class OpenAIProvider implements AIProvider {
    @Override
    public String generateResponse(String question) {
        return "Response from OPENAI for the question: "+question;
    }
}
