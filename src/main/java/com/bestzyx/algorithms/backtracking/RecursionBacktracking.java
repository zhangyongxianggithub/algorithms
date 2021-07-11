package com.bestzyx.algorithms.backtracking;

/**
 * @NAME: zhangyongxiang
 * @Date 2021/7/12 1:38 上午
 * @Version 1.0
 * @Description:
 **/


public class RecursionBacktracking {
    //t 表示递归的深度
    void backtracking(int t) {
        //n用来控制递归的深度
        if(t>n)output(x);//记录可行的解
        else{
            for(int i=f(n,t);i<=g(n,t);i++){//分别是子树的起始编号与终止编号
                x[t]=h(i);//取的子树值
                if(constraint(t)&&bound(t))backtracking(t);
            }
        }
    }
    void iterativeBackTracking(){
        //这是一种栈的思路，t++是入栈，t--是出栈
        int t=1;
        while (t>0){
            if(f(n,t)<=g(n,t)){
                for(int i=f(n,t);i<=g(n,t);i++){//分别是子树的起始编号与终止编号
                    x[t]=h(i);//取的子树值
                    if(constraint(t)&&bound(t)){
                        if(solution(t))output(x);
                        else t++;
                    }
                }
            }else{
                t--;
            }
        }
    }
}
