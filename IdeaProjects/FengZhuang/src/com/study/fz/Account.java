/*
* 创建程序,在其中定义两个类: Account和AccountTest类
* 体会Java的封装性
* 1.Account类要求具有属性: 姓名 (长度为2位3位或4位) 、 余额(必须>20)、密码(必须是六位)，如果不满足，则给出提示信息，并给默认值
* 2.通过setXxx的方法给Account 的属性赋值
* 3.在AccountTest中测试
* */
package com.study.fz;

public class Account {
    public String name;
    private double amount;
    private String password;

//    构造器
    public Account(String name,double amount,String password){
        this.setName(name);
        this.setAmount(amount);
        this.setPassword(password);
    }

    public void showInfo(){
        System.out.println("姓名："+this.name+"\t余额："+this.getAmount()+"\t密码："+this.getPassword());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>1&&name.length()<5){
            this.name = name;
        }else{
            System.out.println("姓名只能是2-4个字");
            this.name = "匿名";
        }

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if(amount>=20){
            this.amount = amount;
        }else{
            System.out.println("金额不能低于20");
            this.amount = 0;
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()==6){
            this.password = password;
        }else{
            System.out.println("密码长度只能是6位");
            this.password = "123456";
        }

    }
}
