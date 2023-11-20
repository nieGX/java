/**
 * 猴子吃桃子问题
 * 有一堆的桃子，猴子每天吃了其中的一半并多吃1个，到第10天时，还没吃就发现只有1个桃子了
 * 问最初共有多少个桃子
 *
 * 用递归解决：
 * 1.第10天：剩余 1
 * 2.第9天： 剩余 (1 + 1) * 2 = 4
 * 3.第8天： 剩余 （4 + 1） * 2 = 10
 * 4.依次往前推：上一轮的结果 + 1 后 再 ×2 得出本轮结果
 * 5.最终结果：
 *
 */

public class MonkeyPeach{
    public static void main(String[] args){
        P p1 = new P();
       int sum =  p1.peachNum(10,1);
        System.out.println("最初共有 "+sum+" 个桃子");
    }
}

class P{
    public int peachNum(int day,int sum){
        if(day>1){
            return peachNum(day-1,(sum+1)*2);
        }

        return sum;
    }
}