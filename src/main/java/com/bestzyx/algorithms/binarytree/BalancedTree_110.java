package com.bestzyx.algorithms.binarytree;

/**
 * Created by zhangyongxiang(张永祥) on 2020/8/18 12:21 上午
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 本题中，一棵高度平衡二叉树定义为：
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 * 示例 1:
 * 给定二叉树 [3,9,20,null,null,15,7]
 * 3
 * / \
 * 9 20
 * / \
 * 15 7
 * 返回 true 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/balanced-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/

public class BalancedTree_110 {
    public boolean isBalanced(TreeNode root) {
        int maxTreeHigh = maxTreeHigh(root, 0);
        return maxTreeHigh != -1;
    }
    
    private int maxTreeHigh(TreeNode tree, int initValue) {
        if (tree == null) {
            return initValue;
        } else {
            int leftTreeHigh = maxTreeHigh(tree.left, initValue + 1);
            int rightTreePath = maxTreeHigh(tree.right, initValue + 1);
            return leftTreeHigh != -1 && rightTreePath != -1
                    && Math.abs(leftTreeHigh - rightTreePath) <= 1
                            ? Math.max(leftTreeHigh, rightTreePath)
                            : -1;
        }
    }
}
