package inheritance;

public class Elephant extends Animal {

    public Elephant(int age) {
        super(age);
        System.out.println("A Elephant has been created.");
    }

    public void talk(){
        System.out.println("*Trumpet Trumpet!*");
    }

    public void walk() {
        System.out.println("*Stomp Stomp Stomp*");
    }

}
