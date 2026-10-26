package Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements DriveItem{
    private final String name;
    private final List<DriveItem> items;

    public Folder(String _name){
        this.name = _name;
        items = new ArrayList<>();
    }

    public void addItem(DriveItem item){
        items.add(item);
    }
    public void removeItem(DriveItem item){
        items.remove(item);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int total = 0;
        for(var item: items){
            total+= item.getSize();
        }

        return total;
    }
}
