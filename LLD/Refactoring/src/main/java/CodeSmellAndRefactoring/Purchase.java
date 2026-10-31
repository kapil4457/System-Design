package CodeSmellAndRefactoring;

import java.util.List;


// Technique : Move Method - Move a method from one class to other, if that method depends heavily on the data/member variables of the other class
public class Purchase {
    List<Item> items;

    public List<Item> getItems(){
        return this.items;
    }


    public double calculateTotal(){
        double total = 0;
        for(Item item : items){
            total += item.getQuantity() * item.getPrice();
        }
        return total;
    }

}
