package com.apphub.algorithm.datastructures.list;

import java.util.List;
import java.util.Scanner;

public class InsertionSort {

    static int count=0;

    public static void main(String... args) {
        ListNode listNode = new ListNode(12);
        listNode.setNext(new ListNode(3));
        listNode.getNext().setNext(new ListNode(14));
        listNode.getNext().getNext().setNext(new ListNode(13));
        listNode.getNext().getNext().getNext().setNext(new ListNode(44));
        listNode.getNext().getNext().getNext().getNext().setNext(new ListNode(6));
        listNode.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(34));
        //listNode.getNext().getNext().getNext().getNext().getNext().getNext().setNext(listNode);
        printList(listNode);
        printList(insertionSort(listNode));
    }

    static void printList(ListNode node) {
        ListNode head = node;
        count++;
        System.out.print(node.data + " ");
        do {
            System.out.print(node.next.getData() + " ");
            node = node.next;
            count++;
        } while (node.getNext() != null);

        System.out.println();
    }

    static ListNode insertionSort(ListNode head){
        ListNode newHead = new ListNode(head.data);
        ListNode nextPointer = head.next;

        while (nextPointer != null) {

            ListNode currPointer = newHead;
            ListNode next = nextPointer.next;

            if (nextPointer.data <= newHead.data) {
                ListNode oldHead = newHead;
                newHead = nextPointer;
                newHead.next = oldHead;
            } else {
                while (currPointer.next != null) {

                    if (nextPointer.data > currPointer.data && nextPointer.data <= currPointer.next.data) {
                        ListNode temp = currPointer.next;
                        currPointer.next = nextPointer;
                        nextPointer.next = temp;
                    }

                    currPointer = currPointer.next;
                }

                if (currPointer.next == null && nextPointer.data > currPointer.data) {
                    currPointer.next = nextPointer;
                    nextPointer.next = null;
                }
            }

            nextPointer = next;
        }

        return newHead;
    }


}
