package Facade;

import java.util.List;

public interface IProvider {
    String execute(String prompt);
    List<String> getCitations(String response);
}
