package Immutability;

import java.time.LocalDateTime;
import java.util.Date;

public class Meeting {
    private String title;
    private LocalDateTime startTime;

    public Meeting(String _title, LocalDateTime _startTime){
        this.title = _title;
        this.startTime = _startTime;
    }


    public String getTitle(){return title;}
    public LocalDateTime getStartTime(){return startTime;}

}
