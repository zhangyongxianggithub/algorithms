package com.bestzyx.algorithms.sort;

/*
 * Created by zhangyongxiang<zyxfoxmail.com> on 2020-07-05 12:24
 *
 * selection sort algorithms
 *
 *
 */

public class SelectionSort {


    public static int[] selectionSort(int[] vals) {

        for (int smallestIndex = 0; smallestIndex < vals.length - 1; smallestIndex++) {
            int leftSmallest = smallestIndex;
            for (int index = smallestIndex + 1; index < vals.length; index++) {
                if (vals[index] < vals[leftSmallest]) {
                    leftSmallest = index;
                }
            }
            swap(vals, smallestIndex, leftSmallest);
        }
        return vals;
    }

    private static void swap(int[] vals, int one, int other) {
        int tmp = vals[one];
        vals[one] = vals[other];
        vals[other] = tmp;
    }
}
