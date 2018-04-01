package linkedlist;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.LinkedList;

public class LinkedListUS {

    // Properties
    Node head;
    int count;

    // Constructors
//    public LinkedList() {
//        this.head = null;
//        this.count = 0;
//    }

    public LinkedListUS(Node newHead) {
        this.head = newHead;
        this.count = count++;
    }


    // Methods

    // Add
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }
    // Get
    public int get(int index) {
        if (index <= 0) {
            return -1;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    // Size
    public int size() {
        return count;
    }

    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }


    // Remove
    public void remove() {
        // remove from back of list
        Node current = head;
        while(current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;

    }



    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Alice");
        System.out.println(linkedlist);
        linkedlist.add("Allan");
        System.out.println(linkedlist);

    }
}
