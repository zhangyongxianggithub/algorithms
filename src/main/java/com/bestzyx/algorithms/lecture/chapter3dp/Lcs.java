package com.bestzyx.algorithms.lecture.chapter3dp;

import java.util.stream.IntStream;

/**
 * Created by zhangyongxiang(张永祥) on 2021/3/21 3:10 上午.
 **/
public class Lcs {
    
    public static int[][] lcsLength(char[] x, char[] y, int[][] b) {
        int m = x.length - 1;
        int n = y.length - 1;
        int[][] c = new int[m + 1][n + 1];
        IntStream.rangeClosed(1, m).forEach(i -> c[i][0] = 0);
        IntStream.rangeClosed(1, n).forEach(j -> c[0][j] = 0);
        IntStream.rangeClosed(1, m).forEach(i -> {
            IntStream.rangeClosed(1, n).forEach(j -> {
                if (x[i] == y[j]) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                    b[i][j] = 1;
                } else if (c[i - 1][j] > c[i][j - 1]) {
                    c[i][j] = c[i - 1][j];
                    b[i][j] = 2;
                } else {
                    c[i][j] = c[i][j - 1];
                    b[i][j] = 3;
                }
            });
        });
        return c;
    }
    
    public static void lcs(int i, int j, char[] x, int[][] b) {
        if (i == 0 || j == 0) {
            return;
        }
        if (b[i][j] == 1) {
            lcs(i - 1, j - 1, x, b);
            System.out.println(x[i]);
        } else if (b[i][j] == 2) {
            lcs(i - 1, j, x, b);
        } else {
            lcs(i, j - 1, x, b);
        }
    }
}
