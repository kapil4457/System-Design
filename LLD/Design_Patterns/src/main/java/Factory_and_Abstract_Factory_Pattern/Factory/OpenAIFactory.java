package Factory_and_Abstract_Factory_Pattern.Factory;

import Factory_and_Abstract_Factory_Pattern.ContextFormatter.OpenAIContextFormatter;
import Factory_and_Abstract_Factory_Pattern.IContextFormatter;
import Factory_and_Abstract_Factory_Pattern.IProvider;
import Factory_and_Abstract_Factory_Pattern.IProviderFactory;
import Factory_and_Abstract_Factory_Pattern.IResponseFormatter;
import Factory_and_Abstract_Factory_Pattern.Provider.OpenAIProvider;
import Factory_and_Abstract_Factory_Pattern.ResponseFormatter.OpenAIResponseFormatter;

public class OpenAIFactory implements IProviderFactory {
    @Override
    public IProvider CreateProvider() {
        return new OpenAIProvider();
    }

    @Override
    public IContextFormatter CreateContextFormatter() {
        return new OpenAIContextFormatter();
    }

    @Override
    public IResponseFormatter CreateResponseFormatter() {
        return new OpenAIResponseFormatter();
    }
}
