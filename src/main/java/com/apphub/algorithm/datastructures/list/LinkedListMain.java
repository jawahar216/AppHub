package com.apphub.algorithm.datastructures.list;

public class LinkedListMain {

  public static void main(String... args) {
    LinkedList list = new LinkedList();
    list.addLast(10);
    list.addFirst(15);
    list.addLast(12);
    list.addFirst(13);
    list.addAtIndex(25, 2);
    list.addAtIndex(40, 0);
    list.addLast(42);
    list.addLast(55);
    System.out.println("List after adding");
    list.print();
    list.removeAtIndex(2);
    list.removeFirst();
    list.removeLast();
    list.removeAtIndex(0);
    System.out.println("List after removing");
    list.print();
    System.out.println("Index of 42 : " + list.searchAndReturnIndex(42));
    System.out.println("Index of 13 : " + list.searchAndReturnIndex(13));
  }
}
