package spaceStructure;

import java.util.List;

public class Star extends CelestialObject{
    private String spectralType;
    private double temperature;
    private boolean isSupernova;

    public Star(Coordinates position, double mass, double size, List<CelestialObject> orbiters, String spectralType, double temperature, boolean isSupernova) {
        super(position, mass, size, orbiters);
        this.spectralType = spectralType;
        this.temperature = temperature;
        this.isSupernova = isSupernova;
    }
    public void fusion(){

    }
    @Override
    public void displayInformation() {

    }
}
