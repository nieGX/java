/**
 * 使用递归的方式求出斐波那契数列
 * 斐波那契数列：1,1,2,3,5,8,13,21...
 * 特点：从第3个数字开始，每一个数字都是前两个数字的和
 *
 * 练习：给你一个整数N，表示第N个位置的数字，求出斐波那契数列
 */
import java.util.Scanner;
public class FBNX{
    public static void main(String[] args){
        // 初始化用户输入扫描器
        Scanner myScanner = new Scanner(System.in);
        // 初始化类
        F myFbnx = new F();

        int n;
        System.out.println("请输入打印多少位的斐波那契数列？");
        n = myScanner.nextInt();
        // 初始化数列长度
        myFbnx.fbnx = new int[n];
        myFbnx.printFBNX(n);
        System.out.println("------------------打印"+n+"位的斐波那契数列--------------------------------");
        for(int i=0;i<myFbnx.fbnx.length;i++){
            System.out.print(myFbnx.fbnx[i]);
            if(i!=myFbnx.fbnx.length - 1){
                System.out.print(" , ");
            }
            myFbnx.sum+=myFbnx.fbnx[i];
        }
        System.out.println();
        System.out.println("斐波那契数列的总和sum= "+myFbnx.sum);


    }
}

class F{
    int sum = 0;
    int[] fbnx;
    public int printFBNX(int n){
        if(n>2){
            // fbnx[n-1] = printFBNX(n-1) + printFBNX(n-2);
            fbnx[n-1] = printFBNX(n-1) + fbnx[n-2];
            return fbnx[n-1];
        }else if(n>0){
            fbnx[n-1] = printFBNX(n-1);
            return fbnx[n-1];
        }

        return 1;

    }
}