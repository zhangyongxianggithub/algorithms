package com.bestzyx.algorithms.binarysearch;
/*
 * Created by zhangyongxiang<zyxfoxmail.com> on 2020-07-05 10:46
 *
 *
 *
 * 在选举中，第 i 张票是在时间为 times[i] 时投给 persons[i] 的。

现在，我们想要实现下面的查询函数： TopVotedCandidate.q(int t) 将返回在 t 时刻主导选举的候选人的编号。

在 t 时刻投出的选票也将被计入我们的查询之中。在平局的情况下，最近获得投票的候选人将会获胜。

示例：

输入：["TopVotedCandidate","q","q","q","q","q","q"], [[[0,1,1,0,0,1,0],[0,5,10,15,20,25,30]],[3],[12],[25],[15],[24],[8]]
输出：[null,0,1,1,0,0,1]
解释：
时间为 3，票数分布情况是 [0]，编号为 0 的候选人领先。
时间为 12，票数分布情况是 [0,1,1]，编号为 1 的候选人领先。
时间为 25，票数分布情况是 [0,1,1,0,0,1]，编号为 1 的候选人领先（因为最近的投票结果是平局）。
在时间 15、24 和 8 处继续执行 3 个查询。
 

提示：

1 <= persons.length = times.length <= 5000
0 <= persons[i] <= persons.length
times 是严格递增的数组，所有元素都在 [0, 10^9] 范围中。
每个测试用例最多调用 10000 次 TopVotedCandidate.q。
TopVotedCandidate.q(int t) 被调用时总是满足 t >= times[0]。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/online-election
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/

public class TopVotedCandidate_911 {

    private int[] persons;

    private int[] times;

    //下标代表times里面的值，是按照时间递增的
    private int[] topVotedCandidates;

    //每个候选人的投票数
    private int[] personVotedCount;


    public TopVotedCandidate_911(int[] persons, int[] times) {
        this.persons = persons;
        this.times = times;
        topVotedCandidates = new int[times.length];
        personVotedCount = new int[persons.length];
        topVotedCandidates[0] = persons[0];
        personVotedCount[persons[0]] += 1;
        for (int index = 1; index < times.length; index++) {
            personVotedCount[persons[index]] += 1;
            int preTopVotedCandidate = topVotedCandidates[index - 1];
            if (personVotedCount[persons[index]] >= personVotedCount[preTopVotedCandidate]) {
                topVotedCandidates[index] = persons[index];
            } else {
                topVotedCandidates[index] = preTopVotedCandidate;
            }
        }
    }

    public int q(int t) {
        int low = 0;
        int high = times.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (times[mid] == t) {
                return topVotedCandidates[mid];
            } else if (times[mid] < t) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return topVotedCandidates[high];
    }

    public static void main(String[] args) {
        int[] persons = new int[]{0, 1, 1, 0, 0, 1, 0}, times = new int[]{0, 5, 10, 15, 20, 25, 30};
        TopVotedCandidate_911 top = new TopVotedCandidate_911(persons, times);
        System.out.println(top.q(25));

    }
}
