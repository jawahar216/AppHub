package com.apphub.algorithm.datastructures.list;

public class UnrolledLinkedList {
    private ULLNode start;
    private ULLNode end;
    private int nodeLimit;
    private int nNode;

    public UnrolledLinkedList(int capacity) {
        start = null;
        end = null;
        nNode = 0;
        nodeLimit = capacity + 1;
    }

    public void insert(int x) {
        nNode++;
        if (start == null) {
            start = new ULLNode(nodeLimit);
            start.blockArray[0] = x;
            start.nBlocks++;
            end = start;
            return;
        }
        if (end.nBlocks + 1 < nodeLimit) {
            end.blockArray[end.nBlocks] = x;
            end.nBlocks++;
        } else {
            ULLNode node = new ULLNode(nodeLimit);
            int j = 0;
            for (int i = end.nBlocks / 2 + 1; i < end.nBlocks; i++)
                node.blockArray[j++] = end.blockArray[i];
            node.blockArray[j++] = x;
            node.nBlocks = j;
            end.nBlocks = end.nBlocks / 2 + 1;
            end.next = node;
            end = node;
        }
    }

    public void display() {
        if (nNode != 0) {
            System.out.println();
            ULLNode node = start;
            while (node != null) {
                for (int i = 0; i < node.nBlocks; i++) System.out.print(node.blockArray[i] + " ");
                System.out.println();
                node = node.next;
            }
        }
    }
}
