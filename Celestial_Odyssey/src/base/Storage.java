package base;

import java.util.List;

public class Storage extends Building{
    private int capacity;
    public Storage(int capacity, int level, List<Resource> resourcesRequired, int baseConstructionTime) {
        super(level, resourcesRequired, baseConstructionTime);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
