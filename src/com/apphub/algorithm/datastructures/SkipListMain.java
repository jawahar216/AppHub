package com.apphub.algorithm.datastructures;

public class SkipListMain {

    public static void main(String... args) {
        SkipList<Integer> skipList = new SkipList(3);
        skipList.insert(4);
        skipList.insert(6);
        skipList.insert(9);
        skipList.insert(3);
    }
}
