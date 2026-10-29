package Memento;

public class Main {
    public static void main(String[] args) {
        Conversation conversation = new Conversation();
        ConversationHistory history = new ConversationHistory();

        conversation.addMessage("Hello");
        conversation.addMessage("Explain Java");

        history.save(conversation); // Save snapshot A
        // [ Hello , Explain Java ] -> state 1

        conversation.addMessage("Explain Memento");
        // [ Hello , Explain Java , Explain Memento ] -> unsaved state 1
        System.out.print("Before undo: ");
        conversation.showMessages();

        history.undo(conversation); // Restore snapshot A
        // [ Hello , Explain Java ] -> state 1
        System.out.print("After undo: ");
        conversation.showMessages();


    }
}
