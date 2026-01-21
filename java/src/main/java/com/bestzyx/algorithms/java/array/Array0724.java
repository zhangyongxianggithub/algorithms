package com.bestzyx.algorithms.java.array;

/**
 * Created by zhangyongxiang on 2026/1/21 21:05
 *
 * @author zhangyongxiang
 *         描述：给定一个数组nums。
 *         要求：找到「左侧元素和」与「右侧元素和相等」的位置，如果找不到，则返回−1。
 *         说明：
 *         1≤nums.length≤10
 *         −1000≤nums[i]≤1000。
 *         示例：
 *         示例 1：
 *         输入：nums = [1, 7, 3, 6, 5, 6]
 *         输出：3
 *         解释：
 *         中心下标是 3 。
 *         左侧数之和 sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11，
 *         右侧数之和 sum = nums[4] + nums[5] = 5 + 6 = 11，二者相等。
 *         示例 2：
 *         输入：nums = [1, 2, 3]
 *         输出：-1
 *         解释：
 *         数组中不存在满足此条件的中心下标。
 */
public class Array0724 {
    public static int pivotIndex(final int[] nums) {
        int sum = 0;
        for (final int num : nums) {
            sum += num;
        }
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (currentSum * 2 + nums[i] == sum) {
                return i;
            }
            currentSum += nums[i];
        }
        return -1;
    }
    
    static void main() {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        nums = new int[] { 1, 2, 3 };
        final int result = pivotIndex(nums);
        System.out.println(result);
    }
}
