package com.apphub.algorithm.datastructures.list;

public class ULLNode {
  ULLNode next;
  int nBlocks;
  Object[] blockArray;

  public ULLNode(int n) {
    next = null;
    nBlocks = 0;
    blockArray = new Object[n];
  }
}
