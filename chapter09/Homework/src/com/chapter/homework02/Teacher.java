package com.chapter.homework02;
/**
 *编写老师类
 * (1)要求有属性 姓名name 年龄age 职称post 基本工资salary
 * (2)编写业务方法，introduce ()，实现输出一个教师的信息。
 * */
public class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String introduce(){
        return name+"\t"+age+"\t"+post+"\t"+salary;
    }
}
