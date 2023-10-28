package characters;

public abstract class Character {
    private String name;
    private int health;
    private int power;
    private String race;

    public Character(String name, int health, int power, String race) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.race = race;
    }

    public abstract void attack();

    public abstract void defend();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
