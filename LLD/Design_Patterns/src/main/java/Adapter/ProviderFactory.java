package Adapter;

import Adapter.Adapter.GrokAdapter;
import Adapter.Provider.AnthropicProvider;
import Adapter.Provider.OpenAIProvider;
import Adapter.ThirdPartyProvider.GrokProvider;

public class ProviderFactory {

    public static IProvider createInstance(ProviderType type){
        return switch (type){
            case ProviderType.ANTHROPIC -> new AnthropicProvider();
            case ProviderType.OPENAI -> new OpenAIProvider();
            case ProviderType.GROK -> new GrokAdapter(new GrokProvider());
            default -> throw new IllegalArgumentException("Provider not supported");
        };
    }
}
