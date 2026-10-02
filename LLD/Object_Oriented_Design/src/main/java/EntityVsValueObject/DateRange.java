package EntityVsValueObject;

import java.time.LocalDate;

public final class DateRange {

    private final LocalDate checkIn;
    private final LocalDate checkout;


    public DateRange(LocalDate _checkIn, LocalDate _checkOut){
        this.checkout = _checkOut;
        this.checkIn = _checkIn;
    }


    public long getNumberOfNights(){
        return checkout.toEpochDay() - checkIn.toEpochDay();
    }


    @Override
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(!(obj instanceof  DateRange))return false;
        DateRange other = (DateRange) obj;

        return other.checkout.equals(this.checkout) && other.checkIn.equals(this.checkIn);
    }


    @Override
    public int hashCode(){
        return checkIn.hashCode() *31 + checkout.hashCode();
    }



}
