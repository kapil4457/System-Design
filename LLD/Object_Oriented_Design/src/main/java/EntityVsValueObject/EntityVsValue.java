package EntityVsValueObject;

import java.time.LocalDate;

public class EntityVsValue {
    public static void main(String[] args) {


        // Entity
//        Guest shreya = new Guest("G-101", "Shreya" , "shreya@gmail.com" , "1234567890");
//        Guest shrey = new Guest("G-101", "Shrey", "shrey@gmail.com","1234567890");
//
//        System.out.println(shreya.equals(shrey));
//        shreya.updateEmail("shrey@gmail.com");
//        shreya.updateName("Shrey");
//        System.out.println(shreya.equals(shrey));


        // Value

//        Money price1 = new Money(200, "INR");
//        Money price2 = new Money(200,"INR");
//
//        System.out.println(price1.equals(price2));


        // Combined - all together

        Guest aman = new Guest("G-101", "Aman Sharma", "aman.sharma@gmail.com", "1234567890");
        DateRange duration = new DateRange(LocalDate.of(2026,10,1), LocalDate.of(2026,10,10));
        Money total = new Money(50000,"INR");


        Booking booking = new Booking("BK-101", aman, duration,total);
        booking.printSummary();
    }
}
