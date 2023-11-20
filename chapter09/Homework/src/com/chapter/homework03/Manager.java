package com.chapter.homework03;

public class Manager extends Employee{
    public Manager(String name, int day, double moneyOfDay, double level) {
        super(name, day, moneyOfDay, level);
    }

    @Override
    public void printSalary() {
        System.out.println("姓名"+"\t"+"日薪"+"\t\t"+"人天"+"\t"+"应发工资");
        System.out.println(this.getName()+"\t"+this.getMoneyOfDay()+"\t"+this.getDay()+"\t"+this.caculateSalary());
    }

    @Override
    public double caculateSalary() {
        return super.caculateSalary() + 1000;
    }
}
