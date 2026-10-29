package Mediator.Components;

import Mediator.ChatMediator;

public class ChatUI {

    private  ChatMediator mediator;


    public void setMediator(ChatMediator _mediator){
        this.mediator = _mediator;
    }
    public void send(String message){
        mediator.sendMessage(message);
    }

    public void display(String response){
        System.out.println("Response from AI: "+response);
    }
}
