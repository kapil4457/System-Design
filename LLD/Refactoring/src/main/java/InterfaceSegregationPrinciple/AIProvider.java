package InterfaceSegregationPrinciple;

public interface AIProvider {
    String generateResponse(String prompt);
    byte[] generateImage(String prompt);
    float[] generateEmbeddings(String prompt);
    void streamResponse(String prompt);
}
