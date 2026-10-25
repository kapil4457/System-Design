package Adapter.ThirdPartyProvider;

import java.util.List;

public class GrokProvider {

    public String generateResponse(String question){
        return "Generated response from Grok";
    }

    public List<String> fetchSources(String response){
        return List.of("GROK-CT-1");
    }
}
