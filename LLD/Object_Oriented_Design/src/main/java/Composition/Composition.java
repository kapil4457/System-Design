package Composition;


// Informal definition : Composition means containing something instead of being something [which is exactly what inheritance is]
public class Composition {
    public static void main(String[] args) {
//        Employee riya = new Employee("Riya",1000000, new SalesBonusStrategy(1200000, 1000000));
//        Employee shrey = new Employee("Shrey", 1200000, new EngineerBonusStrategy(40));
//
//
//        riya.printPaySlip();
//        shrey.printPaySlip();
//
//
//        riya.setBonusStrategy(new EngineerBonusStrategy(5));
//        riya.printPaySlip();


        Employee riya = new Employee("Riya",1000000);
        riya.addBonusStrategy(new SalesBonusStrategy(1200000,1000000));

        riya.printPaySlip();



        riya.addBonusStrategy(new EngineerBonusStrategy(10));

        riya.printPaySlip();


    }
}
