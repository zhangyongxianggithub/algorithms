package com.bestzyx.algorithms.lecture.chapter4greedy;

import java.util.Comparator;
import java.util.stream.IntStream;

public class OptimalLoading {
    
    private static class Element {
        public float w;
        public int i;
        
        public Element(final float w, final int i) {
            this.w = w;
            this.i = i;
        }
        
        public float getW() {
            return w;
        }
    }
    
    public static float loading(float c, final float[] w, final int[] x) {
        final int n = w.length;
        final Element[] d = IntStream.range(0, n)
                .mapToObj(index -> new Element(w[index], index))
                .sorted(Comparator.comparing(Element::getW))
                .toArray(Element[]::new);
        float opt = 0;
        IntStream.range(0, n).forEach(index -> x[index] = 0);
        for (int index = 0; index < n; index++) {
            if (d[index].w <= c) {
                x[d[index].i] = 1;
                opt += d[index].w;
                c -= d[index].w;
            }
        }
        return opt;
    }
}
