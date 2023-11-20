/**
 * 02作业汇总
 */
public class Homework02{
    public static void main(String[] args){
        /**
         * 1.输出 1-100 之间的不能被5整除的数，每5个一行
         */
        // 判断是否满5个数后换行
        int count = 0;
        for(int i=1;i<=100;i++){
            // 首先不能是5的倍数
            if(i%5>0){
                System.out.print(i +" ");
                count++;

                if(count%5==0){
                    System.out.println("");
                }
            }


        }

        System.out.println("\n=================================================");

        /**
         * 2.输出小写的 a-z，以及大写的 Z-A (a:97 -> A:65) 相差32
         */
        char a = 'a';
        char z = 'z';
        for(int i = 0;i<26;i++){  
            // 1.输出 a-z： 97 + i
            // 2.输出 Z-A： 97 + i - 32 + 25-i*2
            System.out.println((char)(a+i)+"\t"+(char)(a+i-32  + 25 - i * 2));
        }


         System.out.println("=================================================");

        /**
         * 3.求出 1 - 1/2 + 1/3 - 1/4 + 1/5 ...... 1/100的和
         */
        // 必须注意到 1/任何整数，结果都是1！！！
        // 所以必须把 1 转为 1.0
        double sum = 0;
        for(int i=1;i<=100;i++){
            // 偶数用减法，奇数用加法
            if(i%2==0){
                sum -= 1.0 / i;
            }else{
                sum+= 1.0 / i;
            }
        }

        System.out.println("1 - 1/2 + 1/3 - 1/4 + 1/5 ...... 1/100的和");
        System.out.println("sum = "+sum);


        System.out.println("=================================================");

        /**
         * 4.求 1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+4+...+100)的结果
         */
        int sumNum = 0;
        for(int i=1;i<=100;i++){
            // 外层表示第几轮
            for(int j=1;j<=i;j++){
                // 内层循环表示每一轮的总和
                sumNum += j;
            }
        }

        System.out.println("1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+4+...+100)的结果");
        System.out.println("sumNum = "+sumNum);
    }
}