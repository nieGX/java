/**
 * 作业1：计算下列表达式的结果：
 * (1) 10 / 3 =?
 * (2) 10 / 5= ?
 * (3) 10 % 2 = ?
 * (4) -10.5 % 3 = ?
 */
public class Homework01{
    public static void main(String[] args){
        // 10和3都是int类型，所以结果也是int类型
        System.out.println("10 / 3 = " + 10 / 3);// 3
        System.out.println("10 / 5 = " + 10 / 5);// 2
        // 10和2都是int类型，所以结果也是int类型 
        System.out.println("10 % 2 = " + 10 % 2);// 0
        // a % b
        // 当a是负数时，记住公式： 结果 = a - (int)a / b * b
        //  -10.5 - (int)-10/3*3 -> -10.5 + 9
        System.out.println("-10.5 % 3 = " + -10.5 % 3);// -1.5

    }
}