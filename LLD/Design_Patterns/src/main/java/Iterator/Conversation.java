package Iterator;

import Iterator.Iterators.BackwardIterator;
import Iterator.Iterators.ForwardIterator;

import java.util.ArrayList;
import java.util.List;

public class Conversation {

    private final Language language;
    List<String> messages = new ArrayList<>();

    public Conversation(Language _language){
        this.language = _language;
    }

    public void addMessage(String message){
        this.messages.add(message);
    }

    public MessageIterator iterator(){
        return switch (language){
            case ENGLISH, HINDI -> new ForwardIterator(messages);
            case URDU -> new BackwardIterator(messages);
            default -> throw new RuntimeException("Language not supported");
        };
    }
}
