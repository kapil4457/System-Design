package Memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class ConversationHistory {
    private final Deque<Conversation.Memento>  history = new ArrayDeque<>();

    public void save(Conversation conversation){
            history.push(conversation.save());
    }

    public void undo(Conversation conversation){
        if(!history.isEmpty()){
            conversation.restore(history.pop());
        }
    }
}
