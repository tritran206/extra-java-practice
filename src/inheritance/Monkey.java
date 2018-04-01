package inheritance;

public class Monkey extends Animal {

    public Monkey(int age) {
        super(age);
        System.out.println("A Monkey has been created.");
    }

    public void talk(){
        System.out.println("ooo aaa oooo aaa aaa");
    }

    public void climb() {
        System.out.println("*The monkey has climbed the tree*");
    }

}
