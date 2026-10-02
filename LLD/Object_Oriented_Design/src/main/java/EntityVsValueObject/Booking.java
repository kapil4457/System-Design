package EntityVsValueObject;

public class Booking {

    private final String bookingId;
    private final Guest guest;
    private final DateRange duration;
    private final Money amount;


    public Booking(String _bookingId, Guest _guest, DateRange _duration, Money _amount){
        this.bookingId = _bookingId;
        this.guest = _guest;
        this.duration = _duration;
        this.amount = _amount;
    }

    public void printSummary(){
        System.out.println("Booking #"+bookingId+" for guest "+guest.getName());
        System.out.println("Stay: "+duration.getNumberOfNights());
        System.out.println("Total: "+amount);
    }


}
