/**
 * 作业2：说出下面代码的结果：
 * int i = 66;
 * System.out.println(++i+i);
 */
public class Homework02{
    public static void main(String[] args){
        int i = 66;
        // 1.有两个运算符 ++ 和 + 
        // 2.++运算符优先级比+高，先计算
        // 3.++i -> i=i+1
        // 67 + i, i=67
        System.out.println(++i+i);// 134
    }
}