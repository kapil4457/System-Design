package Decorator;


import Decorator.Provider.AnthropicProvider;
import Decorator.Provider.OpenAIProvider;

public class ProviderFactory {

    public static IProvider createInstance(ProviderType type){
        return switch (type){
            case ProviderType.ANTHROPIC -> new AnthropicProvider();
            case ProviderType.OPENAI -> new OpenAIProvider();
            default -> throw new IllegalArgumentException("Provider not supported");
        };
    }
}
