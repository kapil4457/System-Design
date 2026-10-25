package Adapter;

import Adapter.ThirdPartyProvider.GrokProvider;

import java.security.Provider;
import java.util.List;

public class main {
    public static void main(String[] args) {

        String question = "Hello there!!";
        IProvider provider = ProviderFactory.createInstance(ProviderType.OPENAI);
        String response = provider.execute(question);
        List<String> citations = provider.getCitations(response);

        System.out.println("Response: "+response);

        // Without adapters -> We had to create objects from concrete classes
        GrokProvider grokProvider = new GrokProvider();
        String answer = grokProvider.generateResponse(question);
        grokProvider.fetchSources(answer);
        System.out.println("Answer: "+answer);


        // With Adapters -> We added a middle layer which understands both the sides
        provider = ProviderFactory.createInstance(ProviderType.GROK);
        response = provider.execute(question);
        citations = provider.getCitations(response);
        System.out.println("Response: "+response);


    }
}