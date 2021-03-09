package com.bestzyx.algorithms.stack;

import java.util.LinkedList;

/**
 * Created by zhangyongxiang(张永祥) on 2021/3/9 5:19 下午.
 **/
public class RemoveDuplicates_1047 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates1("abbaca"));
    }
    
    public static String removeDuplicates1(String S) {
        LinkedList<Character> l = new LinkedList<>();
        for (int index = 0; index < S.length(); index++) {
            if (!l.isEmpty() && l.peek() == S.charAt(index)) {
                l.pop();
            } else {
                l.push(S.charAt(index));
            }
        }
        return l.stream().map(String::valueOf).reduce("", (s1, s2) -> s2 + s1);
    }
}
