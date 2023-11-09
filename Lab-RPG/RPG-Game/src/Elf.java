public class Elf extends Character{
    public void attack(Character target) {
        target.takeDamage(getDamage());
    }
    private boolean dodgeIsActive;
    @Override
    public void takeDamage(int amount) {
        if (isDodgeIsActive()){
            setHealth((int) (getHealth() - amount*0.75));
            setDodgeIsActive(false);
        }else {
            setHealth(getHealth() - amount);
        }
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public void useAbility(Character target) {
        if(target instanceof Elf) {
            setDodgeIsActive(true);
        }
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + getName() + " | HP: " + getHealth() + " | DMG: " + getDamage());
    }

    public Elf(String name, int health, int damage) {
        super(name, health, damage);
        this.dodgeIsActive = false;
    }

    public boolean isDodgeIsActive() {
        return dodgeIsActive;
    }

    public void setDodgeIsActive(boolean dodgeIsActive) {
        this.dodgeIsActive = dodgeIsActive;
    }

}
