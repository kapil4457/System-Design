package Facade.Services;

import java.util.List;

public class PromptBuilder {
    public String build(String question, List<String> documents){
        System.out.println("Inside Prompt Builder");
        return "Prompt from PromptBuilder";
    }
}
