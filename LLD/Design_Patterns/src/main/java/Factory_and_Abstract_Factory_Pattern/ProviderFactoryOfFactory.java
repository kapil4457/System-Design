package Factory_and_Abstract_Factory_Pattern;

import Factory_and_Abstract_Factory_Pattern.Factory.ClaudeFactory;
import Factory_and_Abstract_Factory_Pattern.Factory.OpenAIFactory;
import Factory_and_Abstract_Factory_Pattern.Provider.ClaudeProvider;
import Factory_and_Abstract_Factory_Pattern.Provider.CopilotProvider;
import Factory_and_Abstract_Factory_Pattern.Provider.OpenAIProvider;

public class ProviderFactoryOfFactory {
    public static IProviderFactory Create(ProviderType type){

        return switch(type){
            case ProviderType.OPENAI -> new OpenAIFactory();
            case ProviderType.CLAUDE -> new ClaudeFactory();
            default -> throw new RuntimeException("Provider not supported");
        };
    }
}
