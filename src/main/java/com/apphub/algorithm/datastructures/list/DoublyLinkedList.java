package com.apphub.algorithm.datastructures.list;

public class DoublyLinkedList<T> {

    DoublyNode head = null, tail = null;

    public void addFirst(T data) {
        DoublyNode temp = new DoublyNode(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.setPrev(null);
            temp.setNext(head);
            head.setPrev(temp);
            head = temp;
        }
    }

    public void addAtIndex(T data, int index) {
        DoublyNode temp = new DoublyNode(data);
        DoublyNode currentNode = head;
        DoublyNode prevNode = head;
        int count = 0;
        if (index == 0) {
            temp.setNext(head);
            temp.setPrev(null);
            head.setPrev(temp);
            head = temp;
        }
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            while (index != 0 && count <= index) {
                if (count == index) {
                    temp.setNext(currentNode);
                    temp.setPrev(prevNode);
                    prevNode.setNext(temp);
                    currentNode.setPrev(temp);
                    break;
                } else {
                    prevNode = currentNode;
                    currentNode = currentNode.getNext();
                    count++;
                }
            }
        }
    }

    public void addLast(T data) {
        DoublyNode temp = new DoublyNode(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.setPrev(tail);
            temp.setNext(null);
            tail.setNext(temp);
            tail = temp;
        }
    }

    public void removeFirst() {
        head = head.getNext();
        head.setPrev(null);
    }

    public void removeLast() {
        DoublyNode temp = head;
        while (temp.getNext() != tail) {
            temp = temp.getNext();
        }
        temp.setNext(null);
        tail = temp;
        tail.setNext(null);
    }

    public void removeAtIndex(int index) {
        int count = 0;
        DoublyNode currentNode = head;
        DoublyNode prevNode = head;
        if (index == 0) {
            head = head.getNext();
            head.setPrev(null);
        }
        while (index != 0 && count <= index) {
            if (count == index) {
                prevNode.setNext(currentNode.getNext());
                currentNode.setPrev(null);
                currentNode.setNext(null);
                break;
            } else {
                prevNode = currentNode;
                currentNode = currentNode.getNext();
                count++;
            }

        }
    }

    public int searchAndReturnIndex(T data) {
        DoublyNode temp = head;
        int count = 0;
        while (temp != null) {

            if (data.equals(temp.getData())) {
                return count;
            } else {
                temp = temp.getNext();
                count++;
            }
        }
        return -1;
    }

    public void print() {
        DoublyNode temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }

    }
}



