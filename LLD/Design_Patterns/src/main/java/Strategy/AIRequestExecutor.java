package Strategy;

public class AIRequestExecutor {

    private RetryStrategy retryStrategy;

    public AIRequestExecutor(RetryStrategy _retryStrategy){
        this.retryStrategy = _retryStrategy;
    }

    public void setRetryStrategy(RetryStrategy strategy){
        this.retryStrategy = strategy;
    }

    public String execute(Provider provider, String prompt){
        return retryStrategy.execute(provider,prompt);
    }
}
