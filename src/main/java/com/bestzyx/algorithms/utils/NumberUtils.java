package com.bestzyx.algorithms.utils;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by zhangyongxiang(张永祥) on 2021/3/12 5:38 下午.
 **/
public final class NumberUtils {
    
    private NumberUtils() {}
    
    public static boolean isNumeric(String s) {
        return org.apache.commons.lang3.math.NumberUtils.isCreatable(s);
    }

    public static void main(String[] args){
        System.out.println(StringUtils.isNumeric("१२३"));
    }
}
