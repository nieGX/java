
/**
 * 零钱通系统
 * 1.零钱通明细
 * 2.收益入账
 * 3.支出
 * 4.退出系统
 * */
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class LQT {
    public static void main(String[] args) {

//        1.展示零钱通系统菜单界面
        String horizonChar = "=============";
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        /**
         * 1.零线通明细
         * 数组
         * 对象
         * 字符串拼接 （暂时采用）
         * */
        String starChar = "**************";
        String detailList=starChar+" 零钱通明细 "+starChar;
        /**
         * 2.收益入账
         * 入账金额
         * 入账时间
         * 余额
         * */
        Date date = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        double balance = 0;
        double moneyIn = 0;
        /**
         * 3.支出
         * 支出说明
         * 支出金额
         * 支出时间
         * 余额
         * */
        double moneyOut = 0;
        String moneyOutDesc="";

        /**
         * 4.数据校验
         * 入账金额要大于0
         * 支出金额要小于等于余额且大于0
         * 退出零钱通系统时必须输入y
         * */

        do{
            System.out.println();
            System.out.println(horizonChar+" 零钱通菜单 "+horizonChar);
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.支出");
            System.out.println("\t\t\t4.退     出");
            System.out.println();

            System.out.print("请输入(1-4)：");
            char menuCode = scanner.next().charAt(0);

            switch (menuCode){
                case '1':
                    System.out.println(detailList);
                    break;
                case '2':
                    System.out.print("入账金额：");
                    moneyIn = scanner.nextDouble();
                    if(moneyIn<=0){
                        System.out.println("入账金额错误");
                    }else{
                        balance += moneyIn;
                        date = new Date();
                        detailList +="\n收益入账\t+"+moneyIn+"\t"+dateFormat.format(date)+" 余额："+balance;
                    }
                    break;
                case '3':
                    System.out.print("支出金额：");
                    moneyOut = scanner.nextDouble();
                    //                    需要校验余额是否大于等于支出
                    if(moneyOut>balance){
                        System.out.println("余额不足，支付错误");
                    }else if(moneyOut<=0){
                        System.out.println("支出金额错误");
                    }else{
                        balance -= moneyOut;
                        System.out.print("支出说明：");
                        moneyOutDesc = scanner.next();
                        date = new Date();
                        detailList +="\n"+moneyOutDesc+"\t-"+moneyOut+"\t"+dateFormat.format(date)+" 余额："+balance;
                    }

                    break;
                case '4':
                    System.out.print("是否确定退出零钱通系统？y/n：");
                    char stopLoop = scanner.next().charAt(0);
                    if(stopLoop=='y'){
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
            }
        }while (loop);

        System.out.println(horizonChar+" 退出零钱通系统 "+horizonChar);
    }
}
