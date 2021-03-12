package com.bestzyx.algorithms.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

/**
 * Created by zhangyongxiang(张永祥) on 2021/3/12 5:00 下午.
 **/
public class IsValidaTreePreOrder {
    
    public static void main(String[] args) {
        System.out.println(isValidSerialization("9,#,92,#,#"));
    }
    
    public static boolean isValidSerialization(String preorder) {
        Deque<String> digits = new LinkedList<>();
        for (String value : preorder.split(",")) {
            if (digits.size() == 1 && Objects.equals(digits.peek(), "#")) {
                return false;
            }
            if (Character.isDigit(value.charAt(0))) {
                digits.push(value);
            } else {
                while (digits.size() >= 2
                        && Objects.equals(digits.peek(), "#")) {
                    digits.pop();
                    digits.pop();
                }
                digits.push("#");
            }
        }
        return digits.size() == 1 && Objects.equals(digits.peek(), "#");
        
        // 9,#,92,#,#
    }
}
