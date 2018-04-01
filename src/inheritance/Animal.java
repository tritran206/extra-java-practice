package inheritance;

public class Animal {
    public int age;

    public Animal(int age) {
        this.age = age;
        System.out.println("An inheritance has been created!");
    }

    public void eat() {
        System.out.println("Nom Nom Nom");
    }

    public static void main(String[] args) {
        Animal a = new Animal(5);
        Monkey m = new Monkey(3);
        Elephant e = new Elephant(2);

        a.eat();
        m.eat();
        e.eat();
        m.talk();
        e.walk();

    }


}
