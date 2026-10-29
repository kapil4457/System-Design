package Iterator.Iterators;

import Iterator.MessageIterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ForwardIterator implements MessageIterator {

    private final List<String> messages;
    private int index = 0;

    public ForwardIterator(List<String> _messages){
        this.messages = _messages;
    }


    @Override
    public boolean hasNext() {
        return index < messages.size();
    }

    @Override
    public String next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        return messages.get(index++);
    }
}
