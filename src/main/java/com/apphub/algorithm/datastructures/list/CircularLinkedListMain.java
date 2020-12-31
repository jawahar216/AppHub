package com.apphub.algorithm.datastructures.list;

public class CircularLinkedListMain {

    public static void main(String... args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addFirst(15);
        list.addFirst(13);

        list.addLast(10);
        list.addLast(12);
        list.addFirst(99);
        list.addAtIndex(40, 0);
        list.addLast(42);

        list.addAtIndex(55, 5);
        System.out.println("List after adding");
        list.print();

        list.removeFirst();
        list.removeLast();
        list.removeAtIndex(2);
        list.removeAtIndex(0);
        System.out.println("List after removing");
        list.print();

        System.out.println("Index of 42 : " + list.searchAndReturnIndex(42));
        System.out.println("Index of 13 : " + list.searchAndReturnIndex(13));
        System.out.println("Index of 12 : " + list.searchAndReturnIndex(12));
    }
}
