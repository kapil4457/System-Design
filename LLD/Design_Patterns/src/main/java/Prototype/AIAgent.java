package Prototype;

import java.util.ArrayList;
import java.util.List;

public class AIAgent implements  Prototype{

    private String model;
    private String userPrompt;
    private String systemPrompt;
    private Double temperature;
    private List<String> tools;


    public AIAgent(String _model, String _userPrompt, String _systemPrompt, Double _temperature, List<String> _tools){
        this.model = _model;
        this.userPrompt = _userPrompt;
        this.systemPrompt = _systemPrompt;
        this.temperature = _temperature;
        this.tools = new ArrayList<>(_tools);
    }

    public AIAgent(AIAgent source){
        this.model = source.model;
        this.userPrompt = source.userPrompt;
        this.systemPrompt = source.systemPrompt;
        this.temperature = source.temperature;
        this.tools = new ArrayList<>(source.tools);
    }

    public void setModel(String _model){
        this.model = _model;
    }

    public void setUserPrompt(String _userPrompt){
        this.userPrompt = _userPrompt;
    }
    public void setSystemPrompt(String _systemPrompt){
        this.systemPrompt = _systemPrompt;
    }

    public void setTemperature(Double _temperature){
        this.temperature = _temperature;
    }

    public void setTools(List<String> _tools){
        this.tools = new ArrayList<>(_tools);
    }

    @Override
    public AIAgent copy() {
        return new AIAgent(this);
    }


    public void ToString(){

        System.out.println("#############################################");
        System.out.println("Model: "+model);
        System.out.println("User Prompt: "+userPrompt);
        System.out.println("System Prompt: "+systemPrompt);
        System.out.println("Temperature: "+temperature);
        System.out.println("#############################################");
    }
}
