package Strategy;

public interface RetryStrategy {
    String execute(Provider provider, String prompt);
}
