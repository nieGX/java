package com.myself.lqtOOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 零钱通系统OOP版本
 * 把零钱通各个功能封装到方法中
 * 用到的变量作为类的属性
 * 在另一个APP类中使用零钱通OOP版本
 */
public class LQT {
    //    属性...
    private boolean loop = true;
    private Scanner scanner = new Scanner(System.in);
    private String horizonChar = "===================";
    private String starChar = "*********************";
    private String detailList = starChar + " 零钱通(OOP)明细 " + starChar;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private double balance = 0;
//    方法...

    /**
     * 显示零钱通系统菜单
     */
    public void Menu() {
        do {
            System.out.println();
            System.out.println(horizonChar + " 零钱通菜单(OOP) " + horizonChar);
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费支出");
            System.out.println("\t\t\t4.退     出");
            System.out.println();

            System.out.print("请输入(1-4)：");
            char menuCode = scanner.next().charAt(0);

            switch (menuCode) {
                case '1':
                    Detail();
                    break;
                case '2':
                    inCome();
                    break;
                case '3':
                    onPay();

                    break;
                case '4':
                    Exit();
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
            }
        } while (loop);

    }

    /**
     * 1.显示零钱明细
     */
    public void Detail() {
        System.out.println(detailList);
    }

    /**
     * 2.收益入账
     */
    public void inCome() {
        double moneyIn = 0;
        System.out.print("入账金额：");
        moneyIn = scanner.nextDouble();
        if (moneyIn <= 0) {
            System.out.println("入账金额错误");
            return;
        }
        balance += moneyIn;
        detailList += "\n收益入账\t+" + moneyIn + "\t" + dateFormat.format(new Date()) + " 余额：" + balance;

    }

    /**
     * 3.消费支出
     */
    public void onPay() {
        double moneyOut = 0;
        String moneyOutDesc = "";
        System.out.print("支出金额：");
        moneyOut = scanner.nextDouble();
        // 需要校验余额是否足够支出
        if (moneyOut > balance) {
            System.out.println("余额不足，支付错误");
            return;
        }
//        非法输入
        if (moneyOut <= 0) {
            System.out.println("支出金额错误");
            return;
        }

        balance -= moneyOut;
        System.out.print("支出说明：");
        moneyOutDesc = scanner.next();
        detailList += "\n" + moneyOutDesc + "\t\t-" + moneyOut + "\t" + dateFormat.format(new Date()) + " 余额：" + balance;

    }

    /**
     * 4.退出零钱通
     */
    public void Exit() {
        System.out.print("是否确定退出零钱通(OOP)系统？y/n：");
        char stopLoop = scanner.next().charAt(0);
        if (stopLoop == 'y' || stopLoop == 'Y') {
            loop = false;
            System.out.println("\n" + horizonChar + " 退出零钱通(OOP)系统 " + horizonChar);
        }
    }
}
