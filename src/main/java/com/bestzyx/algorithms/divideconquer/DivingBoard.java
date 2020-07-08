package com.bestzyx.algorithms.divideconquer;

import com.bestzyx.algorithms.utils.PrintUtils;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Created by zhangyongxiang <zyxfox@foxmail.com> on 2020-07-08 15:18
 *
 * 你正在使用一堆木板建造跳水板。有两种类型的木板，其中长度较短的木板长度为shorter，长度较长的木板长度为longer。你必须正好使用k块木板。编写一个方法，生成跳水板所有可能的长度。

返回的长度需要从小到大排列。

示例：

输入：
shorter = 1
longer = 2
k = 3
输出： {3,4,5,6}
提示：

0 < shorter <= longer
0 <= k <= 100000

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/diving-board-lcci
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class DivingBoard {

    public static void main(String[] args) {
        PrintUtils.printArray(divingBoard(1, 1, 100000));
    }

    public static int[] divingBoard(int shorter, int longer, int k) {
        Set<Integer> sets = new HashSet<>();
        int index = 0;
        if (k > 1) {
            index++;
            sets.add(shorter);
            sets.add(longer);
        }
        while (index < k) {
            Set<Integer> newSet = sets.stream().map(value -> value + shorter).collect(Collectors.toSet());
            newSet.addAll(sets.stream().map(value -> value + longer).collect(Collectors.toSet()));
            sets = newSet;
            index++;
        }
        return sets.stream().mapToInt(Integer::intValue).toArray();
    }

}
