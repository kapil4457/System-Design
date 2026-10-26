package Facade;

import Facade.Services.CitationService;
import Facade.Services.EmbeddingService;
import Facade.Services.PromptBuilder;
import Facade.Services.VectorSearchService;

import java.util.List;

public class RAGFacade {
    private final EmbeddingService embeddingService;
    private VectorSearchService vectorSearchService;
    private final PromptBuilder promptBuilder;
    private final IProvider provider;
    private final CitationService citationService;


    public RAGFacade(
            EmbeddingService _embeddingService,
            VectorSearchService _vectorSearchService,
            PromptBuilder _promptBuilder,
            IProvider _provider,
            CitationService _citationService
            ){
        this.embeddingService = _embeddingService;
        this.vectorSearchService = _vectorSearchService;
        this.promptBuilder = _promptBuilder;
        this.provider = _provider;
        this.citationService = _citationService;

    }


    public Answer answerQuestion(String question){
        float[] embeddings = embeddingService.search(question);
        List<String> documents = vectorSearchService.search(embeddings);
        String prompt = promptBuilder.build(question, documents);
        String response = provider.execute(prompt);
        List<String> citations = citationService.extract(response,documents);
        return new Answer(response,citations);
    }


 }
