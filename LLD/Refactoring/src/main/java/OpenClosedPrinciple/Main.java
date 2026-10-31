package OpenClosedPrinciple;

import OpenClosedPrinciple.Providers.AnthropicProvider;
import OpenClosedPrinciple.Providers.GrokProvider;
import OpenClosedPrinciple.Providers.OpenAIProvider;

public class Main {
    public static void main(String[] args) {


        // Way 1: Old way using if-else conditionals
//        AIService aiService = new AIService();
//        String response = aiService.generateResponse("OPENAI","Hello!");
//        System.out.println("RESPONSE: "+response);
//
//        response = aiService.generateResponse("ANTHROPIC","Hello!");
//        System.out.println("RESPONSE: "+response);
//
//        response = aiService.generateResponse("GROK","Hello!");
//        System.out.println("RESPONSE: "+response);


        // Way 2: Using OCP
        AIProvider openai = new OpenAIProvider();
        AIProvider anthropic = new AnthropicProvider();
        AIProvider grok = new GrokProvider();


        AIService aiService = new AIService();
        String response = aiService.generateResponse(openai,"Hello!");
        System.out.println("RESPONSE: "+response);

        response = aiService.generateResponse(anthropic,"Hello!");
        System.out.println("RESPONSE: "+response);

        response = aiService.generateResponse(grok,"Hello!");
        System.out.println("RESPONSE: "+response);



    }
}
