package base;

import java.util.List;

public abstract class Building {
    private int level;
    private List<Resource> resourcesRequired;
    private int baseConstructionTime; //in hours
    public Building(int level, List<Resource> resourcesRequired, int baseConstructionTime) {
        this.level = level;
        this.resourcesRequired = resourcesRequired;
        this.baseConstructionTime = baseConstructionTime;
    }

    public int constructionTime(){
        double constructionTime = baseConstructionTime * Math.pow(level, 1.5);
        return (int)constructionTime;
    }


}
