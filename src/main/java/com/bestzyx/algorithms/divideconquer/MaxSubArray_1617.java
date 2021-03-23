package com.bestzyx.algorithms.divideconquer;

/**
 * Created by zhangyongxiang(张永祥) on 2021/3/23 2:20 下午.
 **/
public class MaxSubArray_1617 {
    
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, i = 0, sum = 0;
        while (i < nums.length) {
            if (sum + nums[i] < nums[i]) {
                sum = 0;
            }
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            i++;
        }
        return max;
    }
}
