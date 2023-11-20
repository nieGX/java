import java.util.Scanner;
/**
 * 本章作业汇总：
 */
public class Homework01{
    public static void main(String[] args){
        /**
         * 1.已知道有一个升序的数组，要求插入一个元素，该数组依然是升序
         * [10,12,45,90],插入23后 [10,12,23,45,90]
         */
        Scanner myScanner = new Scanner(System.in);

        int[] arr1 = {10,12,45,90};
        System.out.println("=======================原数组===========================");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println();
       
       // 一直询问用户是否继续插入，直到用户结束插入
       char input;
       while(true){
         System.out.println("请输入要插入到数组的数字：");
        // 声明临时数组，长度是原数组长度 +1 保存用户插入的数字
        int[] tempArr = new int[arr1.length + 1];
        tempArr[arr1.length] = myScanner.nextInt();

        // 拷贝原数组到临时数组
        for(int i=0;i<arr1.length;i++){
            tempArr[i] = arr1[i];
        }
        // 原数组指向临时数组
        arr1 = tempArr;

        System.out.println("是否继续插入？y/n：");
        input = myScanner.next().charAt(0);
        if(input == 'n' || input == 'N'){
            break;
        }
       }

        // 用冒泡排序法排序
        for(int i=0;i<arr1.length - 1;i++){
            for(int j=0;j<arr1.length -1 - i;j++){
                if(arr1[j]>arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }

        // 打印新数组
        System.out.println("=======================新数组===========================");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}