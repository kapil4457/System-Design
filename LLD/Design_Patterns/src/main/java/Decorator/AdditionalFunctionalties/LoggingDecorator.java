package Decorator.AdditionalFunctionalties;

import Decorator.IProvider;

import java.util.List;

public class LoggingDecorator implements IProvider {
    private final IProvider delegate;

    public LoggingDecorator(IProvider _provider){
        this.delegate = _provider;
    }


    @Override
    public String execute(String prompt) {
        System.out.println("Executing prompt: "+prompt);
        String response = delegate.execute(prompt);
        System.out.println("Request completed");
        return response;
    }

    @Override
    public List<String> getCitations(String response) {
        return delegate.getCitations(response);
    }
}
