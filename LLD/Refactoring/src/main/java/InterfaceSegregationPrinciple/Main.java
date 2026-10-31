package InterfaceSegregationPrinciple;

import InterfaceSegregationPrinciple.ProviderFunctionalities.ImageGenerator;
import InterfaceSegregationPrinciple.ProviderFunctionalities.TextGenerator;
import InterfaceSegregationPrinciple.Providers.AdvancedAIProvider;
import InterfaceSegregationPrinciple.Providers.BasicAIProvider;

public class Main {
    public static void main(String[] args) {


        TextGenerator textGenerator = new BasicAIProvider();
        ChatService chatService = new ChatService(textGenerator);
        String response = chatService.chat("HELLO!");
        System.out.println("RESPONSE: "+response);

        textGenerator = new AdvancedAIProvider();
        chatService = new ChatService(textGenerator);
        response = chatService.chat("HELLO!");
        System.out.println("RESPONSE: "+response);


        ImageGenerator imageGenerator = new AdvancedAIProvider();

    }
}
