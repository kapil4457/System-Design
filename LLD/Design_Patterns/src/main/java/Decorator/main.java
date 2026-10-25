package Decorator;

import Decorator.AdditionalFunctionalties.LoggingDecorator;
import Decorator.AdditionalFunctionalties.TimingDecorator;

public class main {
    public static void main(String[] args) {
        IProvider openAI = ProviderFactory.createInstance(ProviderType.OPENAI);
        IProvider anthropic = ProviderFactory.createInstance(ProviderType.ANTHROPIC);


        IProvider genericProvider  = new LoggingDecorator(openAI);
        genericProvider = new TimingDecorator(genericProvider);
        String response = genericProvider.execute("Hello!! How are you doing??");
        System.out.println("Response: "+response);

        System.out.println("#################################");

        IProvider sensitiveProvider = new TimingDecorator(anthropic);
        response = sensitiveProvider.execute("Hello!! How are you doing??");
        System.out.println("Response: "+response);
    }
}






/*


1. Generic response generation -> OpenAI
2. Based on the given sensitive context, generate response -> Anthropic


Additional Optional Functionalities:
- Timing [ OPENAI , ANTHROPIC ]
- Logging [ OPENAI ]
...
..
.





- Created an instance of the main concrete class [OPENAI , ANTHROPIC]
- Created an instance of the additional functionality and passed the instance of the main/concreate class
  or another additional functionality to this additional functionality
- Each additional functionality have an option to do 2 things:
    - Do something before calling the delegate class
    - Do something after calling the delegate class
- Return the response if any from the delegate class after doing any necessary operations on that response


Request -> [ TimingDecorator [ LoggingDecorator [ OpenAIProvider ] ] ]



 */