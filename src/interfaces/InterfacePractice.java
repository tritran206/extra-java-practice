package interfaces;

import java.util.Random;

public class InterfacePractice {

    public static Character summonCharacter() {

        Random rand = new Random();
        if (Math.abs(rand.nextInt())%2 == 0) {
            return new Enemy();
        } else {
            return new Hero();
        }
    }

    public static void main(String[] args) {

        Enemy darthVader = new Enemy();
        Hero ObiWanKenobi = new Hero();
        darthVader.attack();
        ObiWanKenobi.attack();
        darthVader.heal();
        ObiWanKenobi.heal();
        System.out.println("Enemy Weapon: " + darthVader.getWeapon());
        System.out.println("Hero Weapon: " + ObiWanKenobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();

    }
}
