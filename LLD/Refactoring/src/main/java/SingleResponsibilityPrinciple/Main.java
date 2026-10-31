package SingleResponsibilityPrinciple;

import SingleResponsibilityPrinciple.Services.AIService;
import SingleResponsibilityPrinciple.Services.NotificationService;
import SingleResponsibilityPrinciple.Services.ReportService;
import SingleResponsibilityPrinciple.Services.ResponseRepository;

public class Main {
    public static void main(String[] args) {

        AIService aiService = new AIService();
        NotificationService notificationService = new NotificationService();
        ResponseRepository responseRepository = new ResponseRepository();
        ReportService reportService = new ReportService();

        String question = "What is the capital of India?";
        AIRequestProcessor processor = new AIRequestProcessor(aiService, notificationService,reportService, responseRepository);
        processor.process(question);
    }




    private class UserService{

        private class User{

        }

        // User handling
        public void registerUser(User user){
            validateUser(user);
            saveUser(user);
            sendWelcomeEmail(user);
        }

        // User handling
        private void validateUser(User user){}

        // User handling
        private void saveUser(User user){}

        // User handling
        private void sendWelcomeEmail(User user){}


    }
}


/*
Strategy
Decorator
Observer

 */



