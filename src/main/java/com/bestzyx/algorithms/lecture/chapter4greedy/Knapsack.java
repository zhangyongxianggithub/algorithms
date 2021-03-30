package com.bestzyx.algorithms.lecture.chapter4greedy;

import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * @author zhangyongxiang
 *         created on 2021/3/25 下午8:16.
 **/
public class Knapsack {
    
    public static float knapsack(final float[] v, final float[] w, float c,
            final float[] x) {
        final int n = v.length;
        final Element[] d = IntStream.range(0, n)
                .mapToObj(i -> new Element(i, v[i], w[i])).sorted(Comparator
                        .comparing(Element::getValueForUnit).reversed())
                .toArray(Element[]::new);
        int index;
        float opt = 0;
        IntStream.range(0, n).forEach(i -> x[i] = 0);
        for (index = 0; index < n; index++) {
            if (d[index].w <= c) {
                x[d[index].i] = 1;
                opt += d[index].v;
                c -= d[index].w;
            } else {
                break;
            }
        }
        if (index < n) {
            x[d[index].i] = c / d[index].w;
            opt += x[d[index].i] * d[index].v;
        }
        return opt;
        
    }
}

class Element {
    public int i;
    public float w;
    public float v;
    public float valueForUnit;
    
    public Element(final int i, final float value, final float weight) {
        this.i = i;
        this.w = weight;
        this.v = value;
        this.valueForUnit = value / weight;
    }
    
    public int getI() {
        return i;
    }
    
    public float getValueForUnit() {
        return valueForUnit;
    }
}
