package com.apphub.algorithm.datastructures.list;
public class AddNumbersFromList {


    public static void main(String... args){

        AddNumbersFromList addNumbersFromList = new AddNumbersFromList();
        ListNode l1 = new ListNode(8);
        l1.setNext(new ListNode(4));
        l1.getNext().setNext(new ListNode(5));
        ListNode l2 = new ListNode(2);
        l2.setNext(new ListNode(3));
        l2.getNext().setNext(new ListNode(6));
        //   8 4 5  ->    5 4 8
        //   2 3 6  ->    6 3 2
        // 0 8 1 1  ->  1 1 8 0
        ListNode result = addNumbersFromList.addTwoLists(l1,l2);
        addNumbersFromList.printList(addNumbersFromList.reverseList(result));
    }

    public ListNode reverseList(ListNode node){
        ListNode prev = null;
        ListNode curr =  node;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    public ListNode addTwoLists(ListNode first, ListNode second)
    {
        ListNode res = null;
        ListNode prev = null;
        ListNode temp = null;
        int carry = 0, sum;


        while (first != null || second != null) {

            sum = carry + (first != null ? first.data : 0)
                    + (second != null ? second.data : 0);

            carry = (sum >= 10) ? 1 : 0;

            sum = sum % 10;

            temp = new ListNode(sum);

            if (res == null) {
                res = temp;
            }
            else {
                prev.next = temp;
            }
            prev = temp;

            if (first != null) {
                first = first.getNext();
            }
            if (second != null) {
                second = second.getNext();
            }

        }

        if (carry > 0) {
            temp.next = new ListNode(carry);
        }

        return res;
    }

    void printList(ListNode head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }
}
