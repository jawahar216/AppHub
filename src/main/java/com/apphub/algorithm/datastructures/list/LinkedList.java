package com.apphub.algorithm.datastructures.list;

public class LinkedList<T> {

  Node head = null, tail = null;

  public void addFirst(T data) {
    Node temp = new Node(data);
    if (head == null) {
      head = temp;
      tail = temp;
    } else {
      temp.setNext(head);
      head = temp;
    }
  }

  public void addAtIndex(T data, int index) {
    Node temp = new Node(data);
    Node currentNode = head;
    Node prevNode = head;
    int count = 0;
    if (index == 0) {
      temp.setNext(head);
      head = temp;
    }
    if (head == null) {
      head = temp;
      tail = temp;
    } else {
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
    if (head == null) {
      head = temp;
      tail = temp;
    } else {
      tail.setNext(temp);
      tail = tail.getNext();
    }
  }

  public void removeFirst() {
    head = head.getNext();
  }

  public void removeLast() {
    Node temp = head;
    while (temp.getNext() != tail) {
      temp = temp.getNext();
    }
    temp.setNext(null);
    tail = temp;
  }

  public void removeAtIndex(int index) {
    int count = 0;
    Node currentNode = head;
    Node prevNode = head;
    if (index == 0) {
      head = head.getNext();
    }
    while (index != 0 && count <= index) {
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

  public int searchAndReturnIndex(T data) {
    Node temp = head;
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
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.getData());
      temp = temp.getNext();
    }
  }
}
