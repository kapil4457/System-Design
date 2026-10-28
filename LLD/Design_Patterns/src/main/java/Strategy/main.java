package Strategy;

public class main {
    public static void main(String[] args) {
        Provider provider = new OpenAIProvider();

        AIRequestExecutor executor = new AIRequestExecutor(new FixedDelayRetryStrategy(3, 1000));
        String response = executor.execute(provider,"Hello there!!");
        System.out.println("Response: "+response);



        executor.setRetryStrategy(new ExponentialBackoffRetryStrategy(3,1000));
        response = executor.execute(provider,"Hello there!!");
        System.out.println("Response: "+response );
    }
}
