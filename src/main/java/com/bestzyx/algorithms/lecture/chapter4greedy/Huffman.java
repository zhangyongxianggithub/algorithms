package com.bestzyx.algorithms.lecture.chapter4greedy;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.IntStream;

public class Huffman {
    
    public static void main(final String[] args) {
        final float[] f = new float[] { 1, 1.2f, 5, 8, 3, 2, 4 };
        final BinaryTree root = huffmanTree(f);
        printLeaf(root, "");
    }
    
    public static void printLeaf(final BinaryTree root, final String code) {
        if (root.getLeft() == null && root.getRight() == null) {
            System.out.println(root + ", code = " + code);
        } else {
            if (root.getLeft() != null) {
                printLeaf(root.getLeft(), code + "0");
            }
            if (root.getRight() != null) {
                printLeaf(root.getRight(), code + "1");
            }
        }
    }
    
    public static BinaryTree huffmanTree(final float[] f) {
        final int n = f.length;
        final BinaryTree[] binaryTrees = new BinaryTree[n];
        final Queue<BinaryTree> priorityQueue = new PriorityQueue<>();
        IntStream.range(0, n).forEach(index -> {
            binaryTrees[index] = new BinaryTree((char) (index + '0'), null,
                    null, f[index]);
            priorityQueue.add(binaryTrees[index]);
        });
        IntStream.range(1, n).forEach(index -> {
            final BinaryTree min1 = priorityQueue.remove();
            final BinaryTree min2 = priorityQueue.remove();
            priorityQueue.add(new BinaryTree(null, min1, min2,
                    min1.getWeight() + min2.getWeight()));
        });
        return priorityQueue.remove();
    }
}
