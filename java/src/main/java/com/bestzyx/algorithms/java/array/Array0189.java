package com.bestzyx.algorithms.java.array;

import java.util.Arrays;

/**
 * Created by zhangyongxiang on 2026/1/21 22:55
 *
 * @author zhangyongxiang
 *         描述：给定一个数组nums，再给定一个数字k。
 *         要求：将数组中的元素向右移动k 个位置。
 *         说明：
 *         1≤nums.length≤10^5
 *         −2^31≤nums[i]≤2^31-1
 *         0≤k≤10^5
 *         使用空间复杂度为O(1) 的原地算法解决这个问题。
 *         示例：
 *         示例 1：
 *         输入: nums = [1,2,3,4,5,6,7], k = 3
 *         输出: [5,6,7,1,2,3,4]
 *         解释:
 *         向右轮转 1 步: [7,1,2,3,4,5,6]
 *         向右轮转 2 步: [6,7,1,2,3,4,5]
 *         向右轮转 3 步: [5,6,7,1,2,3,4]
 *         示例 2：
 *         输入：nums = [-1,-100,3,99], k = 2
 *         输出：[3,99,-1,-100]
 *         解释:
 *         向右轮转 1 步: [99,-1,-100,3]
 *         向右轮转 2 步: [3,99,-1,-100]
 */
public class Array0189 {
    
    public static void rotate(final int[] nums, final int k) {
        final int len = nums.length;
        int p = 0;
        int val = nums[p];
        for (int i = 0; i < len; i++) {
            p = (p + k) % len;
            final int tmp = nums[p];
            nums[p] = val;
            val = tmp;
        }
    }
    
    public static void main(final String... args) {
        final int[] nums = { -1,-100,3,99 };
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }
}
