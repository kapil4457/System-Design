package Factory_and_Abstract_Factory_Pattern;

import java.util.List;

public class main {
    public static void main(String[] args) {


// ########### Factory Pattern ###########
        // For the current user, fetch the configuration from the database and pass the type of provider configured here to the factory
//        IProvider provider = ProviderFactory.Create(ProviderType.COPILOT);
//
//        String question = "What is the capital of India?";
//        List<String> context= provider.getReferenceContext(question);
//        String response = provider.generateResponse(question,context);
//        System.out.println(response);


// ########### Abstract  Factory Pattern ###########

        ProviderType configuration = ProviderType.COPILOT;
        IProviderFactory factory = ProviderFactoryOfFactory.Create(configuration);
        IProvider provider = factory.CreateProvider();
        IResponseFormatter responseFormatter = factory.CreateResponseFormatter();
        IContextFormatter contextFormatter = factory.CreateContextFormatter();


        String question = "What is the capital of India?";
        List<String> context =  provider.getReferenceContext(question);
        List<String> formattedContext = contextFormatter.Format(context);

        String response = provider.generateResponse(question,formattedContext);
        String formattedResponse = responseFormatter.Format(response);


        System.out.println("Provider used: "+configuration.toString());
        System.out.println("Context: ");
        context.forEach(System.out::println);
        System.out.println("Formatted Context:");
        formattedContext.forEach(System.out::println);
        System.out.println("Response: "+response);
        System.out.println("Formatted Response: "+formattedResponse);

    }
}



/*
OpenAIProvider
ClaudeProvider


Users
    - configuration which the user configures for themselves which decides which provider they want to be used
       for the required functionalities supported





CodexProvider
CopilotProvider
GeminiProvider
.....




 */