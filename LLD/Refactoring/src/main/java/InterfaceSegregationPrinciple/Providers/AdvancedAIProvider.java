package InterfaceSegregationPrinciple.Providers;

import InterfaceSegregationPrinciple.ProviderFunctionalities.EmbeddingGenerator;
import InterfaceSegregationPrinciple.ProviderFunctionalities.ImageGenerator;
import InterfaceSegregationPrinciple.ProviderFunctionalities.StreamingProvider;
import InterfaceSegregationPrinciple.ProviderFunctionalities.TextGenerator;

public class AdvancedAIProvider implements TextGenerator, EmbeddingGenerator, StreamingProvider, ImageGenerator {
    @Override
    public float[] generateEmbeddings(String prompt) {
        return new float[0];
    }

    @Override
    public byte[] generateImage(String prompt) {
        return new byte[0];
    }

    @Override
    public void streamResponse(String prompt) {

    }

    @Override
    public String generateResponse(String prompt) {
        return "Response generated from Advanced AI Provider";
    }
}
