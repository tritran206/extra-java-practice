package interfaces;

public class Enemy implements Character {

    public String weapon = "lightsaber";

    public void attack() {
        System.out.println("The enemy attacks you!");
    }

    public void heal() {
        System.out.println("The enemy heals himself");

    }

    public void weaponDraw() {
        System.out.println("draw out weapon");
    }

    public String getWeapon() {
        return weapon;
    }

}
