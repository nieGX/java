package com.chapter.homework06;
/**
 * 写一个Teacher类，Teacher类有名称 (name) ，性别 (sex) ，年龄(age) ，工龄 (work age),
 * 做合理封装，通过构造器在创建对象时将4个属性赋值。
 * 教师需要有教学的方法 (teach) ，教学。
 * */
public class Teacher extends Person{
//    private String name;
//    private String sex;
//    private int age;
    private int workAge;

    public Teacher(String name,String sex,int age,int workAge){
        super(name,sex,age);
        this.workAge = workAge;
    }

//    public Teacher(String name,String sex,int age,int workAge){
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this. workAge = workAge;
//    }

    public String teach(){
//        System.out.println("我承诺，我会认真教学。");
        return "我承诺，我会认真教学。";
    }

    @Override
    public String play(){
        return super.play() + "象棋";
    }

    @Override
    public String print(){
        System.out.println("老师的信息：");
        return super.print() + "工龄："+this.workAge+"\n"+this.promise(this)+"\n"+this.play();
    }
}
