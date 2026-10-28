package Strategy;

public class FixedDelayRetryStrategy implements RetryStrategy{

    private final int maxAttempts;
    private final long delayMillis;
    public FixedDelayRetryStrategy(int _maxAttempts, long _delayMillis){
        this.maxAttempts = _maxAttempts;
        this.delayMillis = _delayMillis;
    }
    @Override
    public String execute(Provider provider, String prompt) {

        for(int attempt = 1; attempt <= this.maxAttempts ;attempt++){
            try{
                return provider.execute(prompt);
            }catch (RuntimeException ex){
                if(attempt == this.maxAttempts){
                    throw ex;
                }

                try{
                    Thread.sleep(this.delayMillis);
                }catch (InterruptedException iex){
                    Thread.currentThread().interrupt();
                    throw new RuntimeException("Retry Interrupted",iex);
                }

            }
        }

        // unreachable code - adding it just to resolve compilation errors
        return "";
    }
}
