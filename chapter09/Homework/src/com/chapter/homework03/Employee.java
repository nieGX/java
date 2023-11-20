package com.chapter.homework03;
/**
 *  * 1.部门经理工资=1000+单日工资*天数*等级(1.2)
 *  * 2.普通员工工资=单日工资*天数*等级 (1.0)
 *  * 3.员工属性:姓名，单日工资，工作天数,员工方法 (打印工资)
 * */
public class Employee {
    private String name;
    private int day;
    private double moneyOfDay;
    private double level;

    public Employee(String name,int day,double moneyOfDay,double level){
        this.name = name;
        this.day = day;
        this.moneyOfDay = moneyOfDay;
        this.level = level;
    }
    public void printSalary(){
        System.out.println("姓名"+"\t"+"日薪"+"\t\t"+"人天"+"\t"+"应发工资");
        System.out.println(this.name+"\t"+this.moneyOfDay+"\t"+this.day+"\t"+this.caculateSalary());
    }

    public double caculateSalary(){
        return moneyOfDay * day * level;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public double getMoneyOfDay() {
        return moneyOfDay;
    }

    public double getLevel() {
        return level;
    }
}
