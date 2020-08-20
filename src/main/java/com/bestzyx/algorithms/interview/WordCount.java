package com.bestzyx.algorithms.interview;

/**
 * Created by zhangyongxiang <zyxfox@foxmail.com> on 2020-07-08 18:51
 *
 **/
public class WordCount {
    
    public static int wc(String line) {
        int count = 0, index = 0;
        boolean isWord = false;
        while (index < line.length()) {
            
            if (line.charAt(index) != ' ' && !isWord) {
                isWord = true;
            }
            if (line.charAt(index) == ' ' && isWord) {
                isWord = false;
                count++;
            }
            index++;
            
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(wc("   Hello    world    "));
    }
}
