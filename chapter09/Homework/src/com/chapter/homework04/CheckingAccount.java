package com.chapter.homework04;
/**
 * * 扩展BankAccount类
 *  * (1)在上面类的基础上扩展 新类CheckingAccount对每次存款和取款都收取1美元的手续费
 * */
public class CheckingAccount extends BankAccount{
    private double extraMoney = 1;//手续费
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
    //    存款
    @Override
    public void deposit(double amount){
//        this.setBalance(this.getBalance()+amount-1);
        super.deposit(amount - this.extraMoney);
    }

    //    取款
    @Override
    public void withdraw(double amount){
//        this.setBalance(this.getBalance()-amount-1);
        super.withdraw(amount + this.extraMoney);
    }

    public void setExtraMoney(double extraMoney) {
        this.extraMoney = extraMoney;
    }

    public double getExtraMoney() {
        return extraMoney;
    }
}
