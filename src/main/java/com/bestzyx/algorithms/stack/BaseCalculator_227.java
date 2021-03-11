package com.bestzyx.algorithms.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by zhangyongxiang(张永祥) on 2021/3/11 11:36 上午.
 **/
public class BaseCalculator_227 {
    
    private int e;
    
    public static void main(String[] args) {
        System.out.println(calculate("3+5/2"));
    }
    
    public static int calculate(String s) {
        
        Deque<Integer> digits = new LinkedList<>();
        Deque<Character> operates = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                if (!operates.isEmpty() && operates.peek() == '*') {
                    digits.push(digits.pop() * (ch - '0'));
                    operates.pop();
                } else if (!operates.isEmpty() && operates.peek() == '/') {
                    digits.push(digits.pop() / (ch - '0'));
                    operates.pop();
                } else {
                    digits.push(ch - '0');
                }
            } else {
                operates.push(ch);
            }
        }
        while (!operates.isEmpty() && digits.size() > 1) {
            if (operates.getLast() == '+') {
                digits.addLast(digits.removeLast() + digits.removeLast());
            } else {
                digits.addLast(digits.removeLast() - digits.removeLast());
            }
        }
        return digits.pop();
    }
}
