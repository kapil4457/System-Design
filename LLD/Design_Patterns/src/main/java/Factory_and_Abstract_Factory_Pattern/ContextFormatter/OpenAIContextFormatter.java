package Factory_and_Abstract_Factory_Pattern.ContextFormatter;

import Factory_and_Abstract_Factory_Pattern.IContextFormatter;

import java.util.List;

public class OpenAIContextFormatter implements IContextFormatter {
    @Override
    public List<String> Format(List<String> context) {
        return List.of("Context from OpenAI Context Formatter");
    }
}
