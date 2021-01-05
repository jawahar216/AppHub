package com.apphub.algorithm.datastructures.list;

public class DoublyLinkedListMain {

  public static void main(String... args) {
    DoublyLinkedList list = new DoublyLinkedList();
    list.addLast(10);
    list.addFirst(15);
    list.addLast(20);
    list.addLast(12);
    list.addFirst(13);
    list.addAtIndex(25, 2);
    list.addLast(42);
    list.addLast(55);
    list.addAtIndex(40, 0);
    System.out.println("DoublyList after adding");
    list.print();
    list.removeFirst();
    list.removeLast();
    list.removeAtIndex(2);
    list.removeAtIndex(0);
    System.out.println("DoublyList after removing");
    list.print();
    System.out.println("Index of 42 : " + list.searchAndReturnIndex(42));
    System.out.println("Index of 13 : " + list.searchAndReturnIndex(13));
  }
}
