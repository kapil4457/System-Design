package OpenClosedPrinciple.Providers;

import OpenClosedPrinciple.AIProvider;

public class GrokProvider implements AIProvider {
    @Override
    public String generateResponse(String question) {
        return "Response from GROK for the question: "+question;
    }
}
