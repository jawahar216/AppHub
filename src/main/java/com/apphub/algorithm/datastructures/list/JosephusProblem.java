package com.apphub.algorithm.datastructures.list;

public class JosephusProblem {

  public static void main(String... args) {
    ListNode listNode = new ListNode(5);
    listNode.setNext(new ListNode(4));
    listNode.getNext().setNext(new ListNode(3));
    listNode.getNext().getNext().setNext(new ListNode(2));
    listNode.getNext().getNext().getNext().setNext(new ListNode(3));
    listNode.getNext().getNext().getNext().getNext().setNext(new ListNode(4));
    listNode.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(5));
    printList(listNode);
    // getJosephusPosition(node);
  }

  static void printList(ListNode node) {
    while (node != null) {
      System.out.print(node.getData() + " ");
      node = node.next;
    }
    System.out.println();
  }
}
