package Factory_and_Abstract_Factory_Pattern.Factory;

import Factory_and_Abstract_Factory_Pattern.ContextFormatter.ClaudeContextFormatter;
import Factory_and_Abstract_Factory_Pattern.IContextFormatter;
import Factory_and_Abstract_Factory_Pattern.IProvider;
import Factory_and_Abstract_Factory_Pattern.IProviderFactory;
import Factory_and_Abstract_Factory_Pattern.IResponseFormatter;
import Factory_and_Abstract_Factory_Pattern.Provider.ClaudeProvider;
import Factory_and_Abstract_Factory_Pattern.ResponseFormatter.ClaudeResponseFormatter;

public class ClaudeFactory implements IProviderFactory {
    @Override
    public IProvider CreateProvider() {
        return new ClaudeProvider();
    }

    @Override
    public IContextFormatter CreateContextFormatter() {
        return new ClaudeContextFormatter();
    }

    @Override
    public IResponseFormatter CreateResponseFormatter() {
        return new ClaudeResponseFormatter();
    }
}
