package com.apphub.algorithm.datastructures.list;

public class SkipListNode<T extends Comparable<T>> {
  T data;
  SkipListNode next;
  SkipListNode down;

  SkipListNode(T data) {
    this.data = data;
  }
}
