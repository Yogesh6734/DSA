package com.collection;

public class Main {

    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(4);
        ll.addIndex(13,3);
        ll.displayList();
    }
}
