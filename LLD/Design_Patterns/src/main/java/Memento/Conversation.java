package Memento;

import java.util.ArrayList;
import java.util.List;


// Originator
public class Conversation {
    private List<String> messages = new ArrayList<>();

    public void addMessage(String _message){
        this.messages.add(_message);
    }

    public void showMessages(){
        System.out.println(messages);
    }

    public Memento save(){
        return new Memento(messages);
    }

    public void restore(Memento memento){
        this.messages = new ArrayList<>(memento.getMessages());
    }




    // Snapshot
    public static class Memento{
        private final List<String> messages;

        private Memento(List<String> _messages){
            this.messages = List.copyOf(_messages);
        }

        private List<String> getMessages(){
            return messages;
        }
    }
}
