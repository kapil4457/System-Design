package Strategy;

public class NoRetryStrategy implements RetryStrategy{

    @Override
    public String execute(Provider provider, String prompt) {
        return provider.execute(prompt);
    }
}
