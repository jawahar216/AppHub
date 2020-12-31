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
        // res is head node of the resultant list
        ListNode res = null;
        ListNode prev = null;
        ListNode temp = null;
        int carry = 0, sum;

       /* ListNode reversedFirst = reverseList(first);
        printList(reversedFirst);
        ListNode reversedSecond = reverseList(second);
        printList(reversedSecond);*/


        // while both lists exist
        while (first != null || second != null) {
            // Calculate value of next
            // digit in resultant list.
            // The next digit is sum
            // of following things
            // (i)  Carry
            // (ii) Next digit of first
            // list (if there is a next digit)
            // (ii) Next digit of second
            // list (if there is a next digit)
            sum = carry + (first != null ? first.data : 0)
                    + (second != null ? second.data : 0);

            // update carry for next calulation
            carry = (sum >= 10) ? 1 : 0;

            // update sum if it is greater than 10
            sum = sum % 10;

            // Create a new node with sum as data
            temp = new ListNode(sum);

            // if this is the first node then set
            // it as head of the resultant list
            if (res == null) {
                res = temp;
            }

            // If this is not the first
            // node then connect it to the rest.
            else {
                prev.next = temp;
            }

            // Set prev for next insertion
            prev = temp;

            // Move first and second pointers
            // to next nodes
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

        // return head of the resultant list
        return res;
    }
    /* Utility function to print a linked list */

    void printList(ListNode head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }
}
