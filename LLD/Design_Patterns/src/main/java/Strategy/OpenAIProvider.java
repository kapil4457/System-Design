package Strategy;

public class OpenAIProvider implements Provider {

    public OpenAIProvider(){
        System.out.println("Initializing the OpenAI Provider - expensive call/logic");
    }
    @Override
    public String execute(String query) {

        System.out.println("Calling the actual API....");
        return "OpenAI response for query: "+query;
    }
}
