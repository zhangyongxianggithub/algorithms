package com.bestzyx.algorithms.lecture.chapter4greedy;

/**
 * @author zhangyongxiang
 *         created on 2021/3/25 下午8:16.
 **/
public class Knapsack {
    
    public static void knapsack(final int[] v, final int[] w, final int c,
            final int[][] m) {
        final int n = v.length - 1;
        final int jMax = Math.min(w[n], c);
        for (int j = 0; j < jMax; j++) {
            m[n][j] = 0;
        }
        for (int j = w[n]; j <= c; j++) {
            m[n][j] = v[n];
        }
        for (int i = n - 1; i > 1; i--) {
            // jMax=Math.min()
        }
        
    }
    
}
