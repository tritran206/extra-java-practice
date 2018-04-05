package queues_stacks;

import java.util.Queue;
import java.util.Stack;

public class Stacky {

    public static void main(String[] args) {
        Stack<String> stacky = new Stack<>();

        stacky.push("there!");
        stacky.push("hi ");
        System.out.println(stacky.size());
        System.out.print(stacky.peek());
        System.out.print(stacky.pop());
        System.out.println(stacky.pop());
        System.out.println(stacky.size());
    }
}
