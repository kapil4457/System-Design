package Inheritance;

public class Inheritance {
    public static void main(String[] args) {

        Employee sales = new SalesEmployee("Riya", "EMP-101", 1000000,1500000, 1200000);
        Employee engineer = new EngineerEmployee("Shrey", "EMP-1001", 1200000, 45 );
        Employee ops = new OpsEmployee("Viraj" , "EMP-2002", 1100000);

        sales.checkIn();
        engineer.checkIn();
        ops.checkIn();

        sales.printPayslip();
        engineer.printPayslip();
        ops.printPayslip();
    }
}
