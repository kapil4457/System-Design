package CommandPattern;

import CommandPattern.Commands.ClearHistoryCommand;
import CommandPattern.Commands.GenerateCommand;
import CommandPattern.Commands.SummarizeCommand;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        AIService service = new AIService();

        // Way 1: Straightforward Implementation
//        AIController controller = new AIController(service);
//        String response  = controller.handleRequest("SUMMARIZE", "Hello there");
//        System.out.println("Response: "+response);



        // Way 2: Command Pattern: We define what needs to be done but only do it when we want that thing to be done
        CommandInvoker invoker = new CommandInvoker();
        Command generate = new GenerateCommand(service,"Hello there!!");
        Command summarize = new SummarizeCommand(service,"Capital of India is Delhi.");
        Command clearHistory = new ClearHistoryCommand(service,"CONV-1");


        invoker.executeCommand(generate);
        invoker.executeCommand(summarize);
        invoker.executeCommand(clearHistory);



        // Use Case: Queue
        List<Command> queue = new ArrayList<>();
        queue.add(generate);
        queue.add(summarize);
        queue.add(clearHistory);



        // As and when required
        for(var command: queue){
            command.execute();
        }






    }
}
