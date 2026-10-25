package Builder;

public class main {

    public static void main(String[] args) {


        // Way 1: Constructor based Object creation
        ResponseGenerationRequest request1 = new ResponseGenerationRequest(
                "What is the capital of India",
                "You are a primary school geography teacher. When asked for help, do not answer directly. Given hints atleast 2-3 times and only then you should provide the actual answer",
                null,
                null,
                null,
                null,
                "opus-5.5"
        );



        // Way 2: Using builder pattern
        ResponseGenerationRequest request2 = new ResponseGenerationRequest
                                            .Builder()
                                            .userPrompt("What is the capital of India?")
                                            .systemPrompt("You are a primary school geography teacher. When asked for help, do not answer directly. Given hints atleast 2-3 times and only then you should provide the actual answer")
                                            .build();

        request1.ToString();
        System.out.println("##################################################################");
        request2.ToString();



    }
}



/*

User prompt
System Prompt
Temperature
Max Token limit
List of custom tools
List of formatting instructions
Model
...
..
..
..
.




 */