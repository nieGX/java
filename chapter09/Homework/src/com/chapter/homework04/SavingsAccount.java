package com.chapter.homework04;
/**
 * (2) 扩展前一个练习的BankAccount类，
 * 每个月都有利息产生并且有每月三次免手续费的存款或取款。
 * 在earnMonthlyInterest方法中重置交易计数
 * */
public class SavingsAccount extends BankAccount{
    private double extraMoney = 1;//手续费
    private int count = 3; // 剩余免息交易次数
    private double bonus = 100; // 每月产生的利息

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if(this.count>0){
//            免息存款
            super.deposit(amount);
            this.count--;
            return;
        }

        super.deposit(amount-this.extraMoney);
    }

    @Override
    public void withdraw(double amount) {
        if(this.count>0){
//            免息取款
            super.withdraw(amount);
            this.count--;
            return;
        }

        super.withdraw(amount+this.extraMoney);
    }

    //    月尾重置
    public void earnMonthlyInterest(){
//        利息入账
        super.deposit(this.bonus);
//        重置次数
        this.count = 3;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getExtraMoney() {
        return extraMoney;
    }

    public void setExtraMoney(double extraMoney) {
        this.extraMoney = extraMoney;
    }
}
