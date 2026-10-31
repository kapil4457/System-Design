package DependencyInversionPrinciple;

import DependencyInversionPrinciple.Providers.OpenAIProvider;

public class AIService {
    public final AIProvider provider;

    public AIService(AIProvider _provider){
        this.provider = _provider;
    }

    public String generate(String prompt){
        return provider.generate(prompt);
    }
}


/*
Earlier:
AIService (High Level Code) -> [ OpenAIProvider , AnthropicProvider ] (Low Level Code)
High Level Code -> Low Level Code


Now:
AIService -> AIProvider <- [ OpenAIProvider, AnthropicProvider ]
High Level Code -> Abstraction <- Low Level Code

 */
