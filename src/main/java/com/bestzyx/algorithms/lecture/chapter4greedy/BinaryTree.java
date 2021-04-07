package com.bestzyx.algorithms.lecture.chapter4greedy;

import java.math.BigDecimal;

import lombok.ToString;

@ToString
public class BinaryTree implements Comparable<BinaryTree> {
    
    private Character ch;
    private BinaryTree left;
    private BinaryTree right;
    private float weight;
    
    @Override
    public int compareTo(final BinaryTree o) {
        return BigDecimal.valueOf(this.weight)
                .compareTo(BigDecimal.valueOf(o.getWeight()));
    }
    
    public BinaryTree(final Character ch, final BinaryTree left,
            final BinaryTree right, final float weight) {
        this.ch = ch;
        this.left = left;
        this.right = right;
        this.weight = weight;
    }
    
    public BinaryTree() {}
    
    public Character getCh() {
        return this.ch;
    }
    
    public void setCh(final Character ch) {
        this.ch = ch;
    }
    
    public BinaryTree getLeft() {
        return this.left;
    }
    
    public void setLeft(final BinaryTree left) {
        this.left = left;
    }
    
    public BinaryTree getRight() {
        return this.right;
    }
    
    public void setRight(final BinaryTree right) {
        this.right = right;
    }
    
    public float getWeight() {
        return this.weight;
    }
    
    public void setWeight(final float weight) {
        this.weight = weight;
    }
}
