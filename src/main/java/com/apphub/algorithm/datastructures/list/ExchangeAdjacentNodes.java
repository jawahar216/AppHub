package com.apphub.algorithm.datastructures.list;

public class ExchangeAdjacentNodes {

  public ListNode exchangeAdjacentNodes(ListNode head) {
    ListNode temp = new ListNode(0);
    temp.next = head;
    ListNode prev = temp, curr = head;
    while (curr != null && curr.next != null) {

      int k = curr.data;
      curr.data = curr.next.data;
      curr.next.data = k;
      curr = curr.next.next;
    }
    return temp.next;
  }

  void printList(ListNode head) {
    ListNode temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String args[]) {
    ExchangeAdjacentNodes llist = new ExchangeAdjacentNodes();

    /* Created Linked List 1->2->3->4->5 */
    ListNode listNode = new ListNode(5);
    listNode.setNext(new ListNode(4));
    listNode.getNext().setNext(new ListNode(3));
    listNode.getNext().getNext().setNext(new ListNode(2));
    listNode.getNext().getNext().getNext().setNext(new ListNode(1));
    System.out.println("Linked List before calling pairWiseSwap() ");
    llist.printList(listNode);

    llist.exchangeAdjacentNodes(listNode);

    System.out.println("Linked List after calling pairWiseSwap() ");
    llist.printList(listNode);
  }
}
