package com.study.fz;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("雷军",1999,"xiaomi");
        account.showInfo();
        Account account1 = new Account("罗罗诺亚索隆",0,"77777777");
        account1.showInfo();

    }
}
