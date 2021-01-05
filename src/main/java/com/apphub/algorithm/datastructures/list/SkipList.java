package com.apphub.algorithm.datastructures.list;

import java.util.Random;

public class SkipList<T extends Comparable<T>> {

  int maxLevels;
  Random rand = new Random();
  SkipListNode first;
  int size;

  public SkipList(int listLevels) {
    this.maxLevels = listLevels;

    first = new SkipListNode(null);
    SkipListNode d = new SkipListNode(null);
    first.down = d;

    for (int j = listLevels - 2; j >= 0; j--) {

      d.down = new SkipListNode(null);
      d = d.down;
    }
  }

  /*
   *Makes a new Node containing data and links the node to the node
   *previous and after on all levels from the nodes height and below.
   */

  public void insert(T data) {

    int levels = setHeight();
    SkipListNode newNode = new SkipListNode(data);
    SkipListNode node = first;

    for (int i = maxLevels; i > levels; i--) {
      node = node.down;
    }

    for (int i = levels; i >= 1; i--) {

      SkipListNode previous = findPreviousNodeOnLevel(data, node);
      newNode.next = previous.next;
      previous.next = newNode;

      if (i > 1) {
        newNode.down = new SkipListNode(data);
        newNode = newNode.down;
        node = previous.down;
      }
    }
    size++;
  }

  /*
   * Gives a random number between 1 and maxLevels
   */
  private int setHeight() {
    int n = 0;
    int level = 0;
    while (n != 1 && level < maxLevels) {
      n = rand.nextInt(2) + 1;
      level++;
    }
    return level;
  }

  /*
   * Finds data in the list
   */
  public T get(T data) {
    SkipListNode node = getPreviousNode(data);
    if (node == null || node.next == null || node.next.data == null) {
      return null;
    }
    return (T) getPreviousNode(data).next.data;
  }

  /*
   * Removes data from the list
   */

  public boolean remove(T data) {
    SkipListNode previous = getPreviousNode(data);
    if (previous.next != null) {
      SkipListNode toRemove = previous.next;
      previous.next = toRemove.next;

      while (toRemove.down != null) {
        toRemove = toRemove.down;
        previous = findPreviousNodeOnLevel(data, previous.down);
        previous.next = toRemove.next;
      }

      return true;
    }

    return false;
  }

  /*
   * Returns the node that is before data in the list.
   */
  private SkipListNode getPreviousNode(T data) {
    SkipListNode previous = findPreviousNodeOnLevel(data, first);

    while (true) {
      if (previous.next != null && previous.next.data.equals(data)) {
        return previous;
      }

      if (previous.down != null) {
        previous = previous.down;
        previous = findPreviousNodeOnLevel(data, previous);
      } else {
        return null;
      }
    }
  }

  /*
   * Returns the node before data at the same height/level as current
   */
  private SkipListNode findPreviousNodeOnLevel(T data, SkipListNode current) {

    while (current.next != null && current.next.data.compareTo(data) < 0) {
      current = current.next;
    }
    return current;
  }

  public int getSize() {
    return size;
  }
}
