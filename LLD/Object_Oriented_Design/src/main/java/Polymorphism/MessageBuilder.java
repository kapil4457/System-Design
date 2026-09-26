package Polymorphism;

public class MessageBuilder {

    public String buildMessage(String text){
        return "Text message: "+text;
    }

    public String buildMessage(String text,String attachmentUrl){
        return "Text with attachment: "+text+ " | "+attachmentUrl;
    }

    public String buildMessage(String text, Integer priority){
        return "Priority: "+priority+" | Message: "+text;
    }

}
