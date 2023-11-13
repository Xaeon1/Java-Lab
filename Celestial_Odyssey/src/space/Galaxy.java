package space;

import java.util.List;

public class Galaxy extends CelestialObject {
    private String name;
    private String spectralType;
    private boolean hasSupermassiveBlackHole;
    private double supermassiveBlackHoleMass;
    private int numberOfStars;
    private double starFormationRate;
    private boolean hasHalo;
    public Galaxy(Coordinates position, double mass, double size, List<CelestialObject> orbiters, String name, String shape, double luminosity, String spectralType, boolean hasSupermassiveBlackHole, double supermassiveBlackHoleMass, int numberOfStars, double starFormationRate, boolean hasHalo) {
        super(position, mass, size, orbiters);
        this.name = name;
        this.shape = shape;
        this.luminosity = luminosity;
        this.spectralType = spectralType;
        this.hasSupermassiveBlackHole = hasSupermassiveBlackHole;
        this.supermassiveBlackHoleMass = supermassiveBlackHoleMass;
        this.numberOfStars = numberOfStars;
        this.starFormationRate = starFormationRate;
        this.hasHalo = hasHalo;
    }

    @Override
    public void displayInformation() {
        System.out.println("Galaxy: " + name);
        System.out.println("Size: " + size + " light-years");
        System.out.println("Mass: " + mass + " solar masses");
        System.out.println("Shape: " + shape);
        System.out.println("Luminosity: " + luminosity + " solar luminosities");
        System.out.println("Spectral Type: " + spectralType);
        System.out.println("Has Supermassive Black Hole: " + hasSupermassiveBlackHole);
        if (hasSupermassiveBlackHole) {
            System.out.println("Supermassive Black Hole Mass: " + supermassiveBlackHoleMass + " solar masses");
        }
        System.out.println("Number of Stars: " + numberOfStars);
        System.out.println("Star Formation Rate: " + starFormationRate + " solar masses per year");
        System.out.println("Has Halo: " + hasHalo);
    }
}
