package com.bestzyx.algorithms.utils;

/*
 * Created by zhangyongxiang <zyxfox@foxmail.com> on 2020-07-07 18:01
 *
 */
public final class ArrayUtils {

    private ArrayUtils() {
    }

    public static <T> void swap(T[] vals, int one, int other) {
        T tmp = vals[one];
        vals[one] = vals[other];
        vals[other] = tmp;
    }

    public static void swap(int[] vals, int one, int other) {
        int tmp = vals[one];
        vals[one] = vals[other];
        vals[other] = tmp;
    }
}
