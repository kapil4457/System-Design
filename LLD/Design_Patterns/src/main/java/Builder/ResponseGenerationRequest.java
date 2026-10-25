package Builder;


import java.util.ArrayList;
import java.util.List;

public class ResponseGenerationRequest {

    private String userPrompt; // Required
    private String systemPrompt; // Required
    private Double temperature;
    private Integer tokenLimit;
    private List<String> tools;
    private List<String> formattingInstructions;
    private String modelName;


    public void ToString(){
        System.out.println("User Prompt: "+userPrompt);
        System.out.println("System Prompt: "+systemPrompt);
        System.out.println("Temperature: "+temperature);
        System.out.println("Token Limit: "+tokenLimit);
        System.out.println("Model Name: "+modelName);

    }



    // Way 1: Create a constructor for request object creation
    public ResponseGenerationRequest(String _userPrompt, String _systemPrompt, Double _temperature,
                                     Integer _tokenLimit, List<String> _tools, List<String> _formattingInstructions,
                                     String _modelName){

        this.userPrompt = _userPrompt;
        this.systemPrompt = _systemPrompt;
        this.temperature = _temperature;
        this.modelName = _modelName;
        this.tokenLimit = _tokenLimit;
        this.tools = _tools;
        this.formattingInstructions = _formattingInstructions;
    }


    // Way 2: Using a builder
    private ResponseGenerationRequest(Builder builder){
        this.userPrompt = builder.userPrompt;
        this.systemPrompt = builder.systemPrompt;
        this.temperature = builder.temperature;
        this.modelName = builder.modelName;
        this.tokenLimit = builder.tokenLimit;
        this.tools = builder.tools;
        this.formattingInstructions = builder.formattingInstructions;

    }



    public static class Builder{

        private String userPrompt; // Required
        private String systemPrompt; // Required
        private Double temperature = 0.5;
        private Integer tokenLimit = 5000;
        private List<String> tools = new ArrayList<>();
        private List<String> formattingInstructions = new ArrayList<>();
        private String modelName = "opus-5.5";


        public Builder model(String modelName){
            this.modelName = modelName;
            return this;
        }
        public Builder userPrompt(String userPrompt){
            this.userPrompt = userPrompt;
            return this;
        }
        public Builder temperature(Double temperature){
            this.temperature = temperature;
            return this;
        }
        public Builder systemPrompt(String systemPrompt){
            this.systemPrompt = systemPrompt;
            return this;
        }
        public Builder tokenLimit(Integer tokenLimit){
            this.tokenLimit = tokenLimit;
            return this;
        }
        public Builder tools(List<String> tools){
            this.tools = tools;
            return this;
        }
        public Builder formattingInstructions(List<String> formattingInstructions){
            this.formattingInstructions = formattingInstructions;
            return this;
        }

        public ResponseGenerationRequest build(){
            // validations
            if(userPrompt.trim().isEmpty()){
                throw new IllegalStateException("User Prompt is required");
            }

            if(systemPrompt.trim().isEmpty()){
                throw new IllegalStateException("System Prompt is required");
            }
            return new ResponseGenerationRequest(this);

        }
    }
}
