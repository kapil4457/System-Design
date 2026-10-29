package Observer;

import Observer.Observers.AnalyticsObserver;
import Observer.Observers.AuditLogging;
import Observer.Observers.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {


        List<AIRequestObserver> observers = new ArrayList<>();
        observers.add(new NotificationObserver());
        observers.add(new AuditLogging());
        observers.add(new AnalyticsObserver());



        AIRequest request = new AIRequest(observers);


        String response = request.execute("What is the capital of India ??");
        System.out.println("Final Response: "+response);
    }
}



/*
PROBLEM STATEMENT



AIRequest -> prompt -> response [ PRODUCER of event ]



Things that we want to do for every AIRequest  completion:
- Audit Logging [ CONSUMER-1 ]
- Send Notification [ CONSUMER-2 ]
- Collect Analytics [ CONSUMER-3 ]


 */
