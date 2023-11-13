package space;

import java.util.List;

public class Planet extends CelestialObject{
    private String name;
    private String atmosphere;
    private String terrain;
    private String climate;
    private boolean isSatellite;

    public Planet(Coordinates position, double mass, double size, List<CelestialObject> orbiters, String name, String atmosphere, String terrain, String climate, boolean isSatellite) {
        super(position, mass, size, orbiters);
        this.name = name;
        this.atmosphere = atmosphere;
        this.terrain = terrain;
        this.climate = climate;
        this.isSatellite = isSatellite;
    }

    public String getName() {
        return name;
    }

    public String getAtmosphere() {
        return atmosphere;
    }

    public String getTerrain() {
        return terrain;
    }

    public String getClimate() {
        return climate;
    }

    public boolean isSatellite() {
        return isSatellite;
    }

    public void colonize(){

    }
    public void explore(){

    }
    public void mine(){

    }

    @Override
    public void displayInformation() {
        System.out.println("Planet Information:");
        System.out.println("Position: (" + getPosition() + ")");
        System.out.println("Mass: " + getMass() + " solar masses");
        System.out.println("Size: " + getSize() + " light-years");
        System.out.println("Atmosphere: " + atmosphere);
        System.out.println("Terrain: " + terrain);
        System.out.println("Climate: " + climate);
    }
}
