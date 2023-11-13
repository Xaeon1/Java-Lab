package space;

import java.util.List;

public abstract class CelestialObject {
    Coordinates position;
    double mass; //in kg
    double size; //in km
    List<CelestialObject> orbiters;

    public CelestialObject(Coordinates position, double mass, double size, List<CelestialObject> orbiters) {
        this.position = position;
        this.mass = mass;
        this.size = size;
        this.orbiters = orbiters;
    }

    public Coordinates getPosition() {
        return position;
    }

    public double getMass() {
        return mass;
    }

    public double getSize() {
        return size;
    }
    public void orbit(){
    }
    public void attract(){
    }
    public void collide(CelestialObject ob){
        //if (ob instanceof Planet)
    }
    public abstract void displayInformation();
}
