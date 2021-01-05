package com.apphub.algorithm.datastructures.list;

public class CheckPalindrome {
  public static void main(String... args) {
    ListNode listNode = new ListNode(5);
    listNode.setNext(new ListNode(4));
    listNode.getNext().setNext(new ListNode(3));
    listNode.getNext().getNext().setNext(new ListNode(2));
    listNode.getNext().getNext().getNext().setNext(new ListNode(3));
    listNode.getNext().getNext().getNext().getNext().setNext(new ListNode(4));
    listNode.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(5));
    printList(listNode);
    System.out.println(checkPalindrome(listNode));
  }

  public static boolean checkPalindrome(ListNode node) {
    int count = 0;
    boolean isPalindrome = false;
    ListNode head = node;
    ListNode slowPtr = node;
    ListNode fastPtr = node;
    ListNode newList = new ListNode(0);
    while (fastPtr != null && fastPtr.next != null) {
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;
      count++;
    }
    System.out.println(count);
    if (count > 0) {
      newList.next = slowPtr.next;
    }
    ListNode reversedList = reverseList(newList);
    for (int i = 0; i < count; i++) {
      if (reversedList.data == head.data) {
        isPalindrome = true;
        reversedList = reversedList.next;
        head = head.next;
      } else isPalindrome = false;
    }
    return isPalindrome;
  }

  static void printList(ListNode node) {
    while (node != null) {
      System.out.print(node.getData() + " ");
      node = node.next;
    }
    System.out.println();
  }

  static ListNode reverseList(ListNode node) {
    ListNode prev = null;
    ListNode curr = node;
    ListNode next = null;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }
}
