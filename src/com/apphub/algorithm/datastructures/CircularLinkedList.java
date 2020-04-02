package com.apphub.algorithm.datastructures;

public class CircularLinkedList<T> {

    Node head = null;

    public void addFirst(T data) {
        Node temp = new Node(data);
        Node currentNode = head;
        if (head == null) {
            temp.setNext(temp);
            head = temp;
        } else {
            while (currentNode.getNext() != head) {
                currentNode = currentNode.getNext();
            }
            temp.setNext(head);
            currentNode.setNext(temp);
            head = temp;
        }
    }

    public void addAtIndex(T data, int index) {
        Node temp = new Node(data);
        Node currentNode = head;
        Node prevNode = head;
        int count = 0;
        if (head == null) {
            temp.setNext(temp);
            head = temp;
        } else {
            if (index == 0) {
                while (currentNode.getNext() != head) {
                    currentNode = currentNode.getNext();
                }
                currentNode.setNext(temp);
                temp.setNext(head);
                head = temp;
            }
            while (index != 0 && count <= index) {
                if (count == index) {
                    prevNode.setNext(temp);
                    temp.setNext(currentNode);
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
        Node temp = new Node(data);
        Node currentNode = head;
        if (head == null) {
            temp.setNext(temp);
            head = temp;
        } else {
            while (currentNode.getNext() != head) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(temp);
            temp.setNext(head);
        }
    }

    public void removeFirst() {
        Node currentNode = head;
        while (currentNode.getNext() != head) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(head.getNext());
        head = head.getNext();
    }

    public void removeLast() {
        Node temp = head;
        Node prevNode = head;
        while (temp.getNext() != head) {
            prevNode = temp;
            temp = temp.getNext();
        }
        prevNode.setNext(temp.getNext());
    }

    public void removeAtIndex(int index) {
        int count = 0;
        Node currentNode = head;
        Node prevNode = head;

        if (index == 0) {
            while (currentNode.getNext() != head) {
                prevNode = currentNode;
                currentNode = currentNode.getNext();
            }
            head = head.getNext();
            currentNode.setNext(head);
        } else {
            while (index > 0 && count <= index) {
                if (count == index) {
                    prevNode.setNext(currentNode.getNext());
                    currentNode.setNext(null);
                    break;
                } else {
                    prevNode = currentNode;
                    currentNode = currentNode.getNext();
                    count++;
                }
            }
        }
    }

    public int searchAndReturnIndex(T data) {
        Node temp = head;
        int count = 0;
        while (temp.getNext() != head) {
            if (data.equals(temp.getData())) {
                return count;
            } else {
                temp = temp.getNext();
                count++;
            }
        }
        Node lastNode = temp;
        if (data.equals(lastNode.getData())) {
            return count;
        }
        return -1;
    }

    public void print() {
        Node temp = head;
        while (temp.getNext() != head) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        System.out.println(temp.getData());
    }
}
