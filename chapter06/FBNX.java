/**
 * ʹ�õݹ�ķ�ʽ���쳲���������
 * 쳲��������У�1,1,2,3,5,8,13,21...
 * �ص㣺�ӵ�3�����ֿ�ʼ��ÿһ�����ֶ���ǰ�������ֵĺ�
 *
 * ��ϰ������һ������N����ʾ��N��λ�õ����֣����쳲���������
 */
import java.util.Scanner;
public class FBNX{
    public static void main(String[] args){
        // ��ʼ���û�����ɨ����
        Scanner myScanner = new Scanner(System.in);
        // ��ʼ����
        F myFbnx = new F();

        int n;
        System.out.println("�������ӡ����λ��쳲��������У�");
        n = myScanner.nextInt();
        // ��ʼ�����г���
        myFbnx.fbnx = new int[n];
        myFbnx.printFBNX(n);
        System.out.println("------------------��ӡ"+n+"λ��쳲���������--------------------------------");
        for(int i=0;i<myFbnx.fbnx.length;i++){
            System.out.print(myFbnx.fbnx[i]);
            if(i!=myFbnx.fbnx.length - 1){
                System.out.print(" , ");
            }
            myFbnx.sum+=myFbnx.fbnx[i];
        }
        System.out.println();
        System.out.println("쳲��������е��ܺ�sum= "+myFbnx.sum);


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