package com.chapter.homework03;
/**
 * 通过继承实现员工工资核算打印功能
 * 父类:员工类
 * 子类: 部门经理类、普通员工类
 * 1.部门经理工资=1000+单日工资*天数*等级(1.2)
 * 2.普通员工工资=单日工资*天数*等级 (1.0)
 * 3.员工属性:姓名，单日工资，工作天数,员工方法 (打印工资)
 * 4.普通员工及部门经理都是员工子类,需要重写打印工资方法
 * 5.定义并初始化普通员工对象，调用打印工资方法输入工资，
 * 6.定义并初始化部门经理对象调用打印工资方法输入工资
 * */
public class Homework03 {
    public static void main(String[] args) {
        Worker worker = new Worker("肥贤", 26, 200, 1.0);
        Manager manager = new Manager("马云", 1, 20000, 1.2);

        worker.printSalary();
        manager.printSalary();

    }
}
