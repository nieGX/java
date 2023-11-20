package com.chapter.homework06;
/**
 * 做一个Student类，Student类有名称 (name) ，性别(sex),年龄(age) ，学号 (stu id) ，
 * 做合理封装，通过构造器在创建对象时将4属性赋值。
 * 学生需要有学习的方法 (study) ，在方法里写生“我承诺学习。
 * */
public class Student extends Person{
//    private String name;
//    private String sex;
//    private int age;
    private String stuId;

    public Student(String name,String sex,int age,String id){
        super(name,sex,age);
        this. stuId = id;
    }
//    public Student(String name,String sex,int age,String id){
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this. stuId = id;
//    }

    public String study(){
//        System.out.println("我承诺，我会好好学习。");
        return "我承诺，我会好好学习。";
    }

    @Override
    public String play(){
        return super.play() + "足球";
    }

    @Override
    public String print(){
        System.out.println("学生的信息：");
        return super.print() + "学号："+this.stuId+"\n"+this.promise(this)+"\n"+this.play();
    }

}
