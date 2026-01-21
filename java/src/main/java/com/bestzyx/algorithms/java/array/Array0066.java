package com.bestzyx.algorithms.java.array;

/**
 * Created by zhangyongxiang on 2026/1/21 20:47
 *
 * @author zhangyongxiang
 *         描述：给定一个非负整数数组，数组每一位对应整数的一位数字。
 *         要求：计算整数加1后的结果。
 *         说明：
 *         1≤digits.length≤100。
 *         0≤digits[i]≤9。
 *         示例：
 *         示例 1：
 *         输入：digits = [1,2,3]
 *         输出：[1,2,4]
 *         解释：输入数组表示数字 123，加 1 之后为 124。
 *         示例 2：
 *         输入：digits = [4,3,2,1]
 *         输出：[4,3,2,2]
 *         解释：输入数组表示数字 4321。
 */
public class Array0066 {
    public static int[] plusOne(final int[] digits) {
        int[] result = new int[digits.length];
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (carry == 1) {
                final int sum = digits[i] + carry;
                result[i] = sum % 10;
                carry = sum / 10;
            } else {
                result[i] = digits[i];
            }
        }
        if (carry == 1) {
            final int[] temp = result;
            result = new int[digits.length + 1];
            System.arraycopy(temp, 0, result, 1, temp.length);
            result[0] = carry;
        }
        return result;
    }
}
