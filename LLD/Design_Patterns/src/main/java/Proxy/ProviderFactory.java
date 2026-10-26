package Proxy;

public class ProviderFactory {

    public static Provider create(ProviderType type){
        return switch(type){
            case OPENAI -> new OpenAIProvider();
            default -> throw new IllegalArgumentException("Provider not supported");
        };
    }
}
