package Factory_and_Abstract_Factory_Pattern;

import Factory_and_Abstract_Factory_Pattern.Provider.ClaudeProvider;
import Factory_and_Abstract_Factory_Pattern.Provider.CopilotProvider;
import Factory_and_Abstract_Factory_Pattern.Provider.OpenAIProvider;

public class ProviderFactory {
    public static IProvider Create(ProviderType type){

        return switch(type){
            case ProviderType.OPENAI -> new OpenAIProvider();
            case ProviderType.CLAUDE -> new ClaudeProvider();
            case ProviderType.COPILOT -> new CopilotProvider();
            default -> throw new RuntimeException("Provider not supported");
        };
    }
}
