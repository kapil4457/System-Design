package Iterator.Iterators;

import Iterator.MessageIterator;

import java.util.List;
import java.util.NoSuchElementException;

public class BackwardIterator implements MessageIterator {

    private final List<String> messages;
    private int index = 0;

    public BackwardIterator(List<String> _messages){
        this.messages = _messages;
        index = messages.size()-1;
    }


    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public String next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        return messages.get(index--);
    }
}
