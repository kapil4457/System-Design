package Strategy;

public class ExponentialBackoffRetryStrategy implements RetryStrategy{

    private final int maxAttempts;
    private final long initialdelayMillis;
    public ExponentialBackoffRetryStrategy(int _maxAttempts, long _initialdelayMillis){
        this.maxAttempts = _maxAttempts;
        this.initialdelayMillis = _initialdelayMillis;
    }


    @Override
    public String execute(Provider provider, String prompt) {

        for(int attempt = 1 ; ; attempt++){
            try{
                return provider.execute(prompt);
            }catch (RuntimeException ex){
                    if(attempt >= maxAttempts){
                        throw ex;
                    }
                    long delay = initialdelayMillis * (1L << Math.min(attempt-1,20));

                try{
                    Thread.sleep(delay);
                }catch (InterruptedException iex){
                    Thread.currentThread().interrupt();
                    throw new RuntimeException("Retry Interrupted",iex);
                }
            }
        }
    }
}
