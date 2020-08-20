package com.bestzyx.algorithms.sort;

/**
 * Created by zhangyongxiang<zyxfoxmail.com> on 2020-07-05 12:24
 *
 * selection sort algorithms
 *
 *
 **/

import static com.bestzyx.algorithms.utils.ArrayUtils.swap;
import static com.bestzyx.algorithms.utils.PrintUtils.printArray;

public class SelectionSort {
    
    public static int[] selectionSort(int[] vals) {
        
        for (int smallestIndex = 0; smallestIndex < vals.length
                - 1; smallestIndex++) {
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
    
    public static void main(String[] args) {
        int[] vals = new int[] { 0, 29, 2, 54, 31, 15, 25, 45, 9 };
        printArray(vals);
        selectionSort(vals);
        printArray(vals);
    }
}
