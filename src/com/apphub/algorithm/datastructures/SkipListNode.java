package com.apphub.algorithm.datastructures;

public class SkipListNode<T extends Comparable<T>> {
        T data;
        SkipListNode next;
        SkipListNode down;

        SkipListNode(T data){
            this.data = data;
        }
}
