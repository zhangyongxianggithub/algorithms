package com.bestzyx.algorithms.dp;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zhangyongxiang(张永祥) on 2020/8/19 1:00 上午
 * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
 *  
 * 示例 1：
 * 输入："abc"
 * 输出：3
 * 解释：三个回文子串: "a", "b", "c"
 * 示例 2：
 * 输入："aaa"
 * 输出：6
 * 解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa"
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindromic-substrings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class CountSubstrings_647 {
    public static int countSubstrings(String s) {
        
        int total = 0;
        char[] charArray = s.toCharArray();
        Queue<int[]> queue = new LinkedList<>();
        for (int index = 0; index < charArray.length; index++) {
            queue.add(constructSubString(index, 1));
            if (index < charArray.length - 1
                    && charArray[index] == charArray[index + 1]) {
                queue.add(constructSubString(index, 2));
            }
        }
        
        while (!queue.isEmpty()) {
            int[] substring = queue.poll();
            total++;
            int start = substring[0];
            int count = substring[1];
            if (start > 0 && start + count < charArray.length
                    && charArray[start - 1] == charArray[start + count]) {
                queue.add(constructSubString(start - 1, count + 2));
            }
        }
        return total;
    }
    
    private static int[] constructSubString(int start, int count) {
        int[] substring = new int[2];
        substring[0] = start;
        substring[1] = count;
        return substring;
    }
}
