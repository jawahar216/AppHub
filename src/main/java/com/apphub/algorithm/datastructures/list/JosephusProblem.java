package com.apphub.algorithm.datastructures.list;

import java.util.Scanner;

public class JosephusProblem {

  static int count = 0;

  public static void main(String... args) {
    System.out.println("Enter the position to be removed ");
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    ListNode listNode = new ListNode(5);
    listNode.setNext(new ListNode(4));
    listNode.getNext().setNext(new ListNode(3));
    listNode.getNext().getNext().setNext(new ListNode(21));
    listNode.getNext().getNext().getNext().setNext(new ListNode(34));
    listNode.getNext().getNext().getNext().getNext().setNext(new ListNode(42));
    listNode.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(59));
    listNode.getNext().getNext().getNext().getNext().getNext().getNext().setNext(listNode);
    printList(listNode);
    System.out.println(getJosephusPosition(listNode, k));
  }

  static int getJosephusPosition(ListNode node, int k) {
    int data = 0;
    int listSize = count;
    ListNode head = node;
    ListNode prev = node;
    for (int i = 1; i <= k; i++) {
      while (listSize >= 1 && i == k && node.next != head) {
        data = node.data;
        prev.next = node.next;
        i = 0;
        listSize--;
      }
      prev = node;
      node = node.next;
    }

    return data;
  }

  static void printList(ListNode node) {
    ListNode head = node;
    count++;
    System.out.print(node.data + " ");
    do {
      System.out.print(node.next.getData() + " ");
      node = node.next;
      count++;
    } while (node.getNext() != head);

    System.out.println();
  }
}
