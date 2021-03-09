package com.bestzyx.algorithms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * Created by zhangyongxiang <zyxfox@foxmail.com> on 2020-08-26 08:18
 *
 */
public class LetterCombinations_17 {
    
    Map<Integer, char[]> map = new HashMap<>();
    
    public LetterCombinations_17() {
        map.put(2, new char[] { 'a', 'b', 'c' });
        map.put(3, new char[] { 'd', 'f', 'e' });
        map.put(4, new char[] { 'a', 'b', 'c' });
        map.put(5, new char[] { 'a', 'b', 'c' });
        map.put(6, new char[] { 'a', 'b', 'c' });
        map.put(7, new char[] { 'a', 'b', 'c' });
        map.put(8, new char[] { 'a', 'b', 'c' });
        map.put(9, new char[] { 'a', 'b', 'c' });
    }
    
    public static List<String> letterCombinations(String digits) {
        return null;
    }
    
    public static String removeDuplicates(String S) {
        LinkedList<Character> l = new LinkedList<>();
        char[] charArray = S.toCharArray();
        for (int index = 0; index < S.length(); index++) {
            if (!l.isEmpty() && l.peek() == charArray[index]) {
                l.pop();
            } else {
                l.push(charArray[index]);
            }
        }
        return l.stream().map(String::valueOf).reduce("", (s1, s2) -> s2 + s1);
    }
    
    public static void main(String[] args) {
        System.out.println(removeDuplicates("ca"));
    }
}
