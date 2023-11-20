package com.chapter.homework04;

public class App {
    public static void main(String[] args) {
//        1.BankAccount
        System.out.println("================BankAccount===================");
        BankAccount bankAccount = new BankAccount(10000);
        System.out.println("余额："+bankAccount.getBalance());
//        存款
        bankAccount.deposit(100);
        System.out.println("存款：100");
        System.out.println("余额："+bankAccount.getBalance());
//        取款
        bankAccount.withdraw(10);
        System.out.println("取款：10");
        System.out.println("余额："+bankAccount.getBalance());

        //        2.CheckingAccount
        System.out.println("================CheckingAccount===================");
        CheckingAccount checkingAccount = new CheckingAccount(10000);
        System.out.println("余额："+checkingAccount.getBalance());

//        设置手续费
        checkingAccount.setExtraMoney(10);
//        存款
        checkingAccount.deposit(100);
        System.out.println("存款：100 "+"手续费："+ checkingAccount.getExtraMoney());
        System.out.println("余额："+checkingAccount.getBalance());
//        取款
        checkingAccount.withdraw(10);
        System.out.println("取款：10 "+"手续费："+ checkingAccount.getExtraMoney());
        System.out.println("余额："+checkingAccount.getBalance());

        //        3.SavingsAccount
        System.out.println("================SavingsAccount===================");
        SavingsAccount savingsAccount = new SavingsAccount(10000);

        System.out.println("余额："+savingsAccount.getBalance());

//        设置利息
        savingsAccount.setExtraMoney(100);
//       设置结息
        savingsAccount.setBonus(500);

//        存款
        savingsAccount.deposit(100);
        System.out.println("存款：100 "+"剩余免息次数："+savingsAccount.getCount()+" 手续费："+ savingsAccount.getExtraMoney());
        System.out.println("余额："+savingsAccount.getBalance());

        savingsAccount.deposit(1000);
        System.out.println("存款：1000 "+"剩余免息次数："+savingsAccount.getCount()+" 手续费："+ savingsAccount.getExtraMoney());
        System.out.println("余额："+savingsAccount.getBalance());

        savingsAccount.deposit(10000);
        System.out.println("存款：10000 "+"剩余免息次数："+savingsAccount.getCount()+" 手续费："+ savingsAccount.getExtraMoney());
        System.out.println("余额："+savingsAccount.getBalance());
//        取款
        savingsAccount.withdraw(10);
        System.out.println("取款：10 "+"剩余免息次数："+savingsAccount.getCount()+" 手续费："+ savingsAccount.getExtraMoney());
        System.out.println("余额："+savingsAccount.getBalance());
//        每月结息
        savingsAccount.earnMonthlyInterest();
        System.out.println("每月结息："+savingsAccount.getBonus());
        System.out.println("余额："+savingsAccount.getBalance());

        //        取款
        savingsAccount.withdraw(490);
        System.out.println("取款：490 "+"剩余免息次数："+savingsAccount.getCount()+" 手续费："+ savingsAccount.getExtraMoney());
        System.out.println("余额："+savingsAccount.getBalance());

    }
}
