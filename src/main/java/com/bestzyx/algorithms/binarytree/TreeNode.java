package com.bestzyx.algorithms.binarytree;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Created by zhangyongxiang <zyxfox@foxmail.com> on 2020-07-07 17:40
 *
 */
@Data
@NoArgsConstructor
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        val = x;
    }
}
