package aliasing;

import static aliasing.HairColor.*;

public class Person {

    HairColor hairColor = BLACK;

    public Person() {

    }

    public static void main(String[] args) {
        Person peterParker = new Person();
        Person spiderMan =  peterParker;

        peterParker.hairColor = PINK;

        System.out.println(peterParker.hairColor);
        System.out.println(spiderMan.hairColor);
    }

}
