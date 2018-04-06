package interfaces;

public class Hero implements Character {

    public String weapon = "the force";

    public void attack() {
        System.out.println("The hero attacks the enemy");
    }

    public void heal() {
        System.out.println("The hero heals you");
    }

    public String getWeapon() {
        return weapon;
    }
}
