package CommandPattern.Commands;

import CommandPattern.AIService;
import CommandPattern.Command;

public class ClearHistoryCommand implements Command {
    private final AIService service;
    private final String prompt;


    public ClearHistoryCommand(AIService _service, String _prompt ){
        this.service = _service;
        this.prompt = _prompt;
    }

    @Override
    public void execute() {
        String response = service.clearHistory(prompt);
        System.out.println("Response: "+response);
    }
}
