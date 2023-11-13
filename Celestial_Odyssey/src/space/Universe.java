package space;

import java.util.List;

public class Universe {
    private final double gravity;
    private List<CelestialObject> celestialObjects;

    public Universe(double gravity, List<CelestialObject> celestialObjects) {
        this.gravity = gravity;
        this.celestialObjects = celestialObjects;
    }
}
