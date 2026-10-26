package Proxy;

public class main {
    public static void main(String[] args) {
        System.out.println("Application Started");
        Provider provider = new ProviderProxy(ProviderType.OPENAI);
        String response = provider.execute("Hello there!!");
        System.out.println("Response: "+response);
    }
}
