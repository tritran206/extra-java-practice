package queues_stacks;

import java.util.LinkedList;

public class Queuey {

    LinkedList queue;

    // Making a queue instance
    public Queuey() {
        queue = new LinkedList();
    }

    // Is our Queue empty
    public Boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    // Enqueuing an item
    public void enqueue(int n) {
        queue.addLast(n);
    }

    // Dequeuing an item
    public int dequeue() {
        return (int)queue.remove(0);
    }

    // Peek at the first item
    public int peek() {
        return (int)queue.get(0);
    }

    public static void main(String[] args) {

        Queuey numberQueuey = new Queuey();
        numberQueuey.enqueue(5);
        numberQueuey.enqueue(7);
        numberQueuey.enqueue(6);
        System.out.println("First out: " + numberQueuey.dequeue());
        System.out.println("Next out should be " + numberQueuey.peek());
        System.out.println("Second out: " + numberQueuey.dequeue());
        System.out.println("Next out should be " + numberQueuey.peek());
        System.out.println("Third out: " + numberQueuey.dequeue());

    }
}
