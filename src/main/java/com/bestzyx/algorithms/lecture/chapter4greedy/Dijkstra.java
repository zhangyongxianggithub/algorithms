package com.bestzyx.algorithms.lecture.chapter4greedy;

import java.util.stream.IntStream;

/**
 * Created by zhangyongxiang(zyxfox@foxmail.com) on 2021/4/23 下午8:17
 **/
public class Dijkstra {
    /**
     * v是点的ID，weight是（i，j）的权重，如果没有直接连接则是Float.MAX_VALUE, dist是记录的单源最短路径
     * 
     * @param v
     * @param weight
     * @param dist
     */
    public static void dijkstra(final int v, final float[][] weight,
            final float[] dist) {
        final int n = dist.length - 1;
        if (v < 0 || v > n) {
            return;
        }
        final boolean[] minWeightPointSets = new boolean[n + 1];
        IntStream.rangeClosed(0, n)
                .forEach(index -> dist[index] = weight[v][index]);
        dist[v] = 0;
        minWeightPointSets[v] = true;
        //每次迭代确定一个点，放入到集合S中
        IntStream.range(0, n).forEach(loopIndex -> {
            float temp = Float.MAX_VALUE;
            int currentMinPoint = v;
            for (int point = 0; point <= n; point++) {
                if (!minWeightPointSets[point] && dist[point] < temp) {
                    currentMinPoint = point;
                    temp = dist[point];
                }
            }
            minWeightPointSets[currentMinPoint] = true;
            //最近一个加入到集合中的点，与余下的没有确定最短路径的点比较长短，已确定更短的路径
            for (int point = 0; point <= n; point++) {
                if (!minWeightPointSets[point]
                        && weight[currentMinPoint][point] < Float.MAX_VALUE) {
                    final float newWeight = dist[currentMinPoint]
                            + weight[currentMinPoint][point];
                    if (newWeight < dist[point]) {
                        dist[point] = newWeight;
                    }
                }
            }
        });
    }
}
