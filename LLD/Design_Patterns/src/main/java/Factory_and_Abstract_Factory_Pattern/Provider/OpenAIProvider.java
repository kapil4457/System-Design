package Factory_and_Abstract_Factory_Pattern.Provider;

import Factory_and_Abstract_Factory_Pattern.IProvider;

import java.util.ArrayList;
import java.util.List;

public class OpenAIProvider implements IProvider {
    @Override
    public String generateResponse(String question, List<String> context) {
        StringBuilder response = new StringBuilder();
        response.append("For the given question: ");
        response.append(question);
        response.append(" with the context: ");
        context.forEach(response::append);
        response.append(" , we generated a response from OpenAIProvider");
        return response.toString();
    }

    @Override
    public List<String> getReferenceContext(String question) {
        return new ArrayList<>();
    }
}
