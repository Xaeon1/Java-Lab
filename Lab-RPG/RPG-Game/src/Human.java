public class Human extends Character {
    @Override
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
        if(target instanceof Human) {
            setHealth((int) (target.getHealth() * 1.25));
        }
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + getName() + " | HP: " + getHealth() + " | DMG: " + getDamage());
    }

    public Human(String name, int health, int damage) {
        super(name, health, damage);
    }


}
