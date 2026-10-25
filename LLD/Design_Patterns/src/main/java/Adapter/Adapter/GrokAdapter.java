package Adapter.Adapter;

import Adapter.IProvider;
import Adapter.ThirdPartyProvider.GrokProvider;

import java.util.List;

public class GrokAdapter implements IProvider {

    private final GrokProvider provider;
    public GrokAdapter(GrokProvider _provider){
        this.provider = _provider;
    }

    @Override
    public String execute(String prompt) {
        return provider.generateResponse(prompt);
    }

    @Override
    public List<String> getCitations(String response) {
        return provider.fetchSources(response);
    }
}
