package Composite;

public class File implements DriveItem{

    private final Integer size;
    private final String name;

    public File(String _name, Integer _size){
        this.name = _name;
        this.size = _size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }
}
