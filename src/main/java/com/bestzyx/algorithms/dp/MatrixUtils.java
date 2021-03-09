package com.bestzyx.algorithms.dp;

import java.util.stream.IntStream;

/**
 * Created by zhangyongxiang(张永祥) on 2021/3/7 9:27 下午.
 **/
public final class MatrixUtils {
    private MatrixUtils() {}
    
    public static int[][] matrixMultiply(int[][] a, int[][] b) {
        int aRowSize = a.length;
        int aColumnSize = a[0].length;
        int bRowSize = b.length;
        int bColumnSize = b[0].length;
        if (aColumnSize != bRowSize) {
            throw new IllegalArgumentException("矩阵不可乘");
        }
        int[][] c = new int[aRowSize][bColumnSize];
        IntStream.range(0, aRowSize).forEach(aRowIndex -> {
            IntStream.range(0, bColumnSize).forEach(bColumnIndex -> {
                c[aRowIndex][bColumnIndex] = IntStream.range(0, aColumnSize)
                        .reduce(0, (sum, index) -> sum + a[aRowIndex][index]
                                + b[index][bColumnIndex]);
            });
        });
        return c;
    }
}
