package CodeSmellAndRefactoring;

import java.util.Collections;
import java.util.List;


// Technique -> Encapsulating a Collection
public class Cart {

    List<Item> items;


    public List<Item> getItems(){
            return Collections.unmodifiableList(items);
    }

    public void addItem(Item item){
        if(items.contains(item)){
            System.out.println("Item already exists in the cart.");
            return;
        }

        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }


}


/*


Caller's Perspective:

Cart cart  = new Cart();
List<Item> items = cart.getItems();
items.add(new Items());
items.remove();
items.size();
items.clear(); -> allowed earlier if we gave the caller class all the access

items.clear() -> Unsupported Operation

Cart cart = new Cart();
List<Item> items = cart.getItems();
cart.addItem(new Item());
cart.removeItems(item);

 */