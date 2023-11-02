public class Orc extends Character{
    public void attack(Character target) {
        target.takeDamage(getDamage());
    }
    @Override
    public void takeDamage(int amount) {
        setHealth(getHealth() - amount);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    public void useAbility(Character target) {
        target.setHealth((int) (target.getHealth() - (getDamage()*1.25)));
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + getName() + " | HP: " + getHealth() + " | DMG: " + getDamage());
    }
    public Orc(String name, int health, int damage) {
        super(name, health, damage);
    }
}
