package Prototype;

import java.util.ArrayList;
import java.util.List;


// Using one object as a base/template to create another object with the same set of attributes/values is prototyping
public class main {
    public static void main(String[] args) {

        AIAgent agent1 = new AIAgent(
                "sonnet-5.5",
                "Give code for calculating gcd of 5 and 15",
                "You are a python code generator. For the given query generate code in python language only.",
                0.5,
                new ArrayList<>(List.of("github-push","github-merge")));



//         Way 1: Repetitive object configuration from scratch
        AIAgent agent2 = new AIAgent(
                "sonnet-5.5",
                "Give code for calculating gcd of 5 and 15",
                "You are a java code generator. For the given query generate code in java language only.",
                0.5,
                new ArrayList<>(List.of("github-push","github-merge"))
        );



        // Way 2: Prototype
        AIAgent agent3  = agent1.copy();
        agent3.setSystemPrompt("You are a java code generator. For the given query generate code in java language only.");

        agent1.ToString();
        agent2.ToString();
        agent3.ToString();
    }
}

