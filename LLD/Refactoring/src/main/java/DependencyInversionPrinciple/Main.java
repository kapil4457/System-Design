package DependencyInversionPrinciple;

import DependencyInversionPrinciple.Providers.AnthropicProvider;
import DependencyInversionPrinciple.Providers.OpenAIProvider;

public class Main {
    public static void main(String[] args) {

        AIService aiService = new AIService(new OpenAIProvider());
        String response = aiService.generate("Hello!");
        System.out.println("RESPONSE: "+response );


        aiService = new AIService(new AnthropicProvider());
        response = aiService.generate("Hello!");
        System.out.println("RESPONSE: "+response );
    }
}
