package Facade;

import Adapter.Adapter.GrokAdapter;
import Adapter.ThirdPartyProvider.GrokProvider;
import Facade.Provider.AnthropicProvider;
import Facade.Provider.OpenAIProvider;

public class ProviderFactory {

    public static IProvider createInstance(ProviderType type){
        return switch (type){
            case ProviderType.ANTHROPIC -> new AnthropicProvider();
            case ProviderType.OPENAI -> new OpenAIProvider();
            default -> throw new IllegalArgumentException("Provider not supported");
        };
    }
}
