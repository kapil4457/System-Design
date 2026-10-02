package Immutability;

import java.time.LocalDateTime;
import java.util.Date;

public class ReminderService {
    public void scheduleReminder(Meeting meeting){

        // Mutable code
//        Date startTime = meeting.getStartTime();
//
//        // Reminder 1 : 24hrs
//        Date reminder24h = meeting.getStartTime();
//        reminder24h.setTime(reminder24h.getTime() - (24*60*60*1000));
//        System.out.println("24hrs prior reminder set for: "+reminder24h);
//
//        // Reminder 2 : 1 hour
//        Date reminder1h = meeting.getStartTime();
//        reminder1h.setTime(reminder1h.getTime() - (60*60*1000));
//        System.out.println("1hr prior reminder set for: "+reminder1h);
//
//        // Reminder 3 : start time
//        System.out.println("Start time reminder set for: "+startTime);



        // Immutable code

        LocalDateTime startTime = meeting.getStartTime();

        // Reminder 1 : 24hrs
        LocalDateTime reminder24h = startTime.minusHours(24);
        System.out.println("24hrs prior reminder set for: "+reminder24h);

        // Reminder 2 : 1 hour
        LocalDateTime reminder1h = startTime.minusHours(1);
        System.out.println("1hr prior reminder set for: "+reminder1h);

        // Reminder 3 : start time
        System.out.println("Start time reminder set for: "+startTime);


    }
}
