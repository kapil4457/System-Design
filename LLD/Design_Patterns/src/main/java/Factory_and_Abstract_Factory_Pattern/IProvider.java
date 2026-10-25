package Factory_and_Abstract_Factory_Pattern;

import java.util.List;

public interface IProvider {

    ///  Generates response using the Provider implementations for the given question and context
    public String generateResponse(String question, List<String> context );

    /// Fetches relevant context from vector store for the given question
    public List<String> getReferenceContext(String question);
}
