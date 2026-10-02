package Immutability;

import java.time.LocalDateTime;
import java.util.Date;

public class Immutability {
    public static void main(String[] args) {
        LocalDateTime meetingStart = LocalDateTime.of(2026,10,2,15,0);
        System.out.println("Actual meeting time: "+meetingStart);
        Meeting standup = new Meeting("Spring Planning",meetingStart);

        ReminderService reminderService = new ReminderService();
        reminderService.scheduleReminder(standup);
    }
}
