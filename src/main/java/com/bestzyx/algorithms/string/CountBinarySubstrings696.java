package com.bestzyx.algorithms.string;

/**
 * Created by zhangyongxiang<zhangyongxiang02@maoyan.com> on 2020-08-10 12:00 下午
 *
 * 给定一个字符串 s，计算具有相同数量0和1的非空(连续)子字符串的数量，并且这些子字符串中的所有0和所有1都是组合在一起的。
 *
 * 重复出现的子串要计算它们出现的次数。
 *
 * 示例 1 :
 *
 * 输入: "00110011"
 * 输出: 6
 * 解释: 有6个子串具有相同数量的连续1和0：“0011”，“01”，“1100”，“10”，“0011” 和 “01”。
 *
 * 请注意，一些重复出现的子串要计算它们出现的次数。
 *
 * 另外，“00110011”不是有效的子串，因为所有的0（和1）没有组合在一起。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-binary-substrings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class CountBinarySubstrings696 {

    public int countBinarySubstrings(String s) {
        int sum=0;
        char[] chars=s.toCharArray();
        for(int index=0;index<s.length();index++){


        }
        return sum;
    }
}
