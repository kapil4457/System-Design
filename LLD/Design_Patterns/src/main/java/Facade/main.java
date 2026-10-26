package Facade;

import Facade.Services.CitationService;
import Facade.Services.EmbeddingService;
import Facade.Services.PromptBuilder;
import Facade.Services.VectorSearchService;


public class main {
    public static void main(String[] args) {
        String query = "What is the difference between a kafka producer and consumer??";

        EmbeddingService embeddingService = new EmbeddingService();
        VectorSearchService vectorSearchService = new VectorSearchService();
        PromptBuilder promptBuilder = new PromptBuilder();
        IProvider provider = ProviderFactory.createInstance(ProviderType.ANTHROPIC);
        CitationService citationService = new CitationService();

        RAGFacade ragFacade = new RAGFacade(embeddingService,vectorSearchService,promptBuilder,provider,citationService);
        Answer ans = ragFacade.answerQuestion(query);
        System.out.println("Answer: "+ans.response);
    }
}
