public abstract class Character implements Playable{
    private String name;
    private int health;
    private int damage;

    public abstract void takeDamage(int amount);
    public abstract boolean isAlive();
    public abstract void useAbility(Character target);
    public abstract void showInfo();

    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
