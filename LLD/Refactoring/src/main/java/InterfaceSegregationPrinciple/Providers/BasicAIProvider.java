package InterfaceSegregationPrinciple.Providers;
import InterfaceSegregationPrinciple.ProviderFunctionalities.EmbeddingGenerator;
import InterfaceSegregationPrinciple.ProviderFunctionalities.TextGenerator;

public class BasicAIProvider implements TextGenerator, EmbeddingGenerator {
    @Override
    public String generateResponse(String prompt) {
        return "Generating response from Basic AI Provider.";
    }

    @Override
    public float[] generateEmbeddings(String prompt) {
        return new float[0];
    }
}
