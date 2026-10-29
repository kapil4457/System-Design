package Mediator;

import Mediator.Components.AIService;
import Mediator.Components.ChatUI;
import Mediator.Components.HistoryService;
import Mediator.Components.NotificationService;

public class DefaultChatMediator implements ChatMediator{

    private final ChatUI chatUI;
    private final AIService aiService;
    private final HistoryService historyService;
    private final NotificationService notificationService;

    public DefaultChatMediator(ChatUI _chatUI, AIService _aiService, HistoryService _historyMediator, NotificationService _notificationService){
        this.chatUI = _chatUI;
        this.aiService = _aiService;
        this.historyService = _historyMediator;
        this.notificationService = _notificationService;
    }


    @Override
    public void sendMessage(String message) {
        historyService.save(message);
        String response = aiService.generateResponse(message);
        historyService.save(response);
        chatUI.display(response);
        notificationService.notifyUser();
    }
}
