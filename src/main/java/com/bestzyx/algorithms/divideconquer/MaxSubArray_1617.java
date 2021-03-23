package com.bestzyx.algorithms.divideconquer;

import java.util.Arrays;

/**
 * Created by zhangyongxiang(张永祥) on 2021/3/23 2:20 下午.
 **/
public class MaxSubArray_1617 {
    
    public static int maxSubArray(int[] nums) {
        int[] max = new int[nums.length];
        Arrays.fill(max, 0);
        max[0] = nums[0];
        for (int index = 1; index < nums.length; index++) {
            max[index] = Math.max(max[index - 1], max(nums, index));
        }
        return max[nums.length];
    }
    
    private static int max(int[] mums, int end) {
        for (; end >= 0; end--) {
            
        }
        return 0;
    }
}
