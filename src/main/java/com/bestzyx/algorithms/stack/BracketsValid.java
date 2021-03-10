package com.bestzyx.algorithms.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.regex.Pattern;

/**
 * Created by zhangyongxiang(张永祥) on 2021/3/10 3:49 下午.
 **/
public class BracketsValid {
    
    public static boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        boolean isValid = true;
        for (int index = 0; index < s.length() && isValid; index++) {
            char ch = s.charAt(index);
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                isValid = !stack.isEmpty() && stack.pop() == '(';
            } else if (ch == ']') {
                isValid = !stack.isEmpty() && stack.pop() == '[';
            } else if (ch == '}') {
                isValid = !stack.isEmpty() && stack.pop() == '{';
            }
        }
        isValid = isValid && stack.isEmpty();
        return isValid;
    }
    
    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }
}
