package com.chapter.homework03;
/**
 * 普通员工及部门经理都是员工子类,需要重写打印工资方法
 * */
public class Worker extends Employee{
    public Worker(String name, int day, double moneyOfDay, double level) {
        super(name, day, moneyOfDay, level);
    }

    @Override
    public void printSalary() {
        super.printSalary();
    }
}
