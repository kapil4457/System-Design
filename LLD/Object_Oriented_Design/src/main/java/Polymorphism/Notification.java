package Polymorphism;

public abstract class Notification {

    protected String recipient;

    public Notification(String _recipient){
        this.recipient = _recipient;
    }

    public abstract void send(String message);
}
