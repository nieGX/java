package com.chapter.homework05;
/**
 * 编写Doctor类{name, age,job,gender, sal}
 * 相应的getter和setter方法,5个参数的构造器，
 * 重写父类的equals方法: public boolean equals(Object obj) 并判断测试类中创建的两个对象是否相等。
 * 相等就是判断属性是否相同
 * */
public class Doctor {
    private String name;
    private int age;
    private String post;
    private String gender;
    private  double salary;

    public Doctor(String name, int age, String post, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }


        if(!(obj instanceof Doctor)) return false;

//        向下转型
        Doctor doctor = (Doctor)obj;
        if(!this.name.equals(doctor.name)) return false;
        if(!this.gender.equals(doctor.gender)) return false;
        if(!this.post.equals(doctor.post)) return false;
        if(this.age!=doctor.age) return false;
        if(this.salary!=doctor.salary) return false;

        return true;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
