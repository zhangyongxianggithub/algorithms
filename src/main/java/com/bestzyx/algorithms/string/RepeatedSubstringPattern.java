package com.bestzyx.algorithms.string;

/*
 * Created by zhangyongxiang <zyxfox@foxmail.com> on 2020-08-24 12:59
 *
 */
public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        char[] charArray = s.toCharArray();

        int first = 0;
        int second = 0;
        int head = 1;
        int subLength = 0;
        while (head < charArray.length) {
            if (first == second && charArray[head] == charArray[first]) {
                second = head;
                subLength++;
            }
            if (first != second && charArray[first + subLength] == charArray[head]) {
                continue;
            } else {

            }
            head++;
        }

        return false;

    }
}
