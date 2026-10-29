package Iterator;

import Iterator.Iterators.BackwardIterator;
import Iterator.Iterators.ForwardIterator;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Conversation conversation = new Conversation(Language.ENGLISH);
        conversation.addMessage("ENG-1");
        conversation.addMessage("ENG-2");
        conversation.addMessage("ENG-3");

        MessageIterator iterator = conversation.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("=======================================");

        conversation = new Conversation(Language.HINDI);
        conversation.addMessage("HINDI-1");
        conversation.addMessage("HINDI-2");
        conversation.addMessage("HINDI-3");

        iterator = conversation.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=======================================");

        conversation = new Conversation(Language.URDU);
        conversation.addMessage("URDU-1");
        conversation.addMessage("URDU-2");
        conversation.addMessage("URDU-3");

        iterator = conversation.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("=======================================");


        List<String> messages = List.of("MSG-1","MSG-2","MSG-3");
        Iterator<String> itr = messages.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }




    }
}
