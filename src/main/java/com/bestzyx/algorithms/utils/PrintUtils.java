package com.bestzyx.algorithms.utils;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by zhangyongxiang <zyxfox@foxmail.com> on 2020-07-07 21:20
 **/
public final class PrintUtils {

    private static ObjectMapper objectMapper=new ObjectMapper();
    public static <T> void printArray(T[] array) {
        
        System.out.println(Arrays.toString(array));
    }
    
    public static void printArray(int[] array) {
        
        System.out.println(Arrays.toString(array));
    }

    public static void printObject(Object object){
        try {
            System.out.println(objectMapper.writeValueAsString(object));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
