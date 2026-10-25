package Decorator.AdditionalFunctionalties;

import Decorator.IProvider;

import java.util.List;

public class TimingDecorator implements IProvider {

    private final IProvider delegate;

    public TimingDecorator(IProvider _provider){
        this.delegate = _provider;
    }

    @Override
    public String execute(String prompt) {
        long start = System.nanoTime();
        try{
            return delegate.execute(prompt);
        }finally {
            long elapsed = System.nanoTime() - start;
            System.out.println("Execution time: "+elapsed/1_000_000+" ms");
        }
    }

    @Override
    public List<String> getCitations(String response) {
        return delegate.getCitations(response);
    }
}
