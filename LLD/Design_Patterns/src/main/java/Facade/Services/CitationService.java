package Facade.Services;

import java.util.List;

public class CitationService {

    public List<String> extract(String response, List<String> documents){
        System.out.println("Inside Citation Service");
        return List.of("CIT-01","CIT-02");
    }
}
