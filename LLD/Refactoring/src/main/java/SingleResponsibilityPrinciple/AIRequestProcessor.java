package SingleResponsibilityPrinciple;

import SingleResponsibilityPrinciple.Services.AIService;
import SingleResponsibilityPrinciple.Services.NotificationService;
import SingleResponsibilityPrinciple.Services.ReportService;
import SingleResponsibilityPrinciple.Services.ResponseRepository;

public class AIRequestProcessor {

    private final AIService aiService;
    private final NotificationService notificationService;
    private final ReportService reportService;
    private final ResponseRepository responseRepository;


    public AIRequestProcessor(AIService _aiService,
                              NotificationService _notificationService,
                              ReportService _reportService,
                              ResponseRepository _responseRepository){
        this.aiService = _aiService;
        this.notificationService = _notificationService;
        this.reportService = _reportService;
        this.responseRepository = _responseRepository;
    }

    public void process(String question){
        String response = aiService.generateResponse(question);
        responseRepository.saveToDatabase(response);
        notificationService.notifyUser(response);
        reportService.generateReport(response);
    }
}
