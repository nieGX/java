import java.util.Scanner;
/**
 * 本章作业练习题汇总
 */
public class Homework{
    public static void main(String[] args){
        /**
         * 1.某人有100000(10万)元，每经过一个路口，需要交费，规则如下
         * (1)当现金>50000(5万)时，每次交5%
         * (2)当现金<=50000(5万)时，每次交1000
         * 要求使用 while break 方式计算出该人可以经过多少次路口
         */
        // 当前现金数
        double cash = 100000;
        // 统计经过路口数量
        int count = 0;

        while(true){
            if(cash>50000){
                // 现金＞5万，交5%
                cash -= cash * 0.05;
            }else{
                cash -= 1000;
            }
            // 经过路口次数+1
             count++;
            if(cash<1000){
                // 现金数＜1000，退出循环
                break;
            }
        }

        System.out.println("此人可以经过 "+count+" 次路口\n还剩下 "+cash+" 元");

        System.out.println("============================================================================");
        /**
         * 2.实现判断一个整数，属于哪个范围：＞0，＜0，=0
         */
        Scanner myScanner = new Scanner(System.in);
        int num;
        System.out.println("请输入一个整数：");
        num = myScanner.nextInt();
        // System.out.println("num="+num);
        if(num>0){
            System.out.println(num+"＞0");
        }else if(num<0){
             System.out.println(num+"＜0");
        }else{
             System.out.println(num+"=0");
        }

         System.out.println("============================================================================");
        /**
         * 3.判断一个年份是否为闰年
         * (1)年份是4的倍数，且不是100的倍数的，为闰年
         * (2)年份是400的倍数是闰年
         */
        
        int year;
        System.out.println("请输入年份：");
        year = myScanner.nextInt();
        if((year % 4 == 0 && year % 100 > 0 )||year % 400 == 0 ){
            System.out.println(year+"年是闰年！");
        }else{
            System.out.println(year+"年不是闰年。");
        }


         System.out.println("============================================================================");
        /**
         *4.判断一个整数是否为水仙花数
         * 水仙花数：一个3位数，每一位的个数的立方和等于数字本身
         */
        
        int flowerNum;
        int baiNum;// 百分位数字
        int shiNum;// 十分位数字
        int geNum;// 个分位数字
        do{
            System.out.println("请输入一个 100 - 999 之间的整数：");
            flowerNum = myScanner.nextInt();
          }while(flowerNum<=0||flowerNum>=1000);//如果输入的数字不在100 - 999的范围的整数，则循环要求输入正确数字

          // 获取百分位数字
        baiNum = flowerNum / 100;
         // 获取十分位数字
        shiNum = (flowerNum % 100) / 10;
         // 获取个分位数字
        geNum = (flowerNum % 100) % 10;

        // 计算立方和
        int sum = (int)(Math.pow(baiNum,3) + Math.pow(shiNum,3) + Math.pow(geNum,3));

        if(sum==flowerNum){
            System.out.println("恭喜！ "+flowerNum+" 是水仙花数！");
        }else{
            System.out.println(flowerNum+" 不是水仙花数。");
        }

    }
}