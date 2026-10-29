package Mediator;

import Mediator.Components.AIService;
import Mediator.Components.ChatUI;
import Mediator.Components.HistoryService;
import Mediator.Components.NotificationService;

public class Main {
    public static void main(String[] args) {

        AIService aiService = new AIService();
        HistoryService historyService = new HistoryService();
        NotificationService notificationService = new NotificationService();
        ChatUI chatUI = new ChatUI();

        ChatMediator mediator = new DefaultChatMediator(chatUI,aiService,historyService,notificationService);

        chatUI.setMediator(mediator);
        chatUI.send("Hello there!");
    }
}
