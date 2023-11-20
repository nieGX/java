import java.util.Scanner;
public class ArrayReduce{
    public static void main (String[] args){

        /**
         * 有一个数组 {1,2,3,4,5}，可以将数组缩减，
         * 提示用户是否继续缩减，y继续 n结束
         * 每次缩减最后一个元素，
         * 当只剩下一个元素提示用户不能再缩减
         */
        // 1.原数组
        int[] myArray = {1,2,3,4,5};

                Scanner myScanner = new Scanner(System.in);
                char input;
        do{
             // 2.新数组
        int[] newArray = new int[myArray.length - 1];
        // 3.拷贝数组
        for(int i=0;i<newArray.length;i++){
            newArray[i] = myArray[i];
        }
        // 4.修改指向
        myArray = newArray;
                System.out.println("============ myArray 缩减后=================");
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i]+"\t");
        }

        // 判断数组长度是否为1
        if(myArray.length == 1){
            System.out.println("数组myArray只剩下最后一个元素，不能再缩减了");
            break;

        }else{
            // 5.提示是否继续
        System.out.print("是否继续删减数组？y/n：");
        input = myScanner.next().charAt(0);

        // 判断是否结束
        if(input == 'n' || input == 'N'){
            break;
        }
        }

        }while(true);

        System.out.println("缩减结束了...");
       


    }
}