package Facade;

import java.util.List;

public class Answer {
    public String response;
    public List<String> citations;

    public Answer(String _response, List<String> _citations){
        this.response = _response;
        this.citations = _citations;
    }
}
