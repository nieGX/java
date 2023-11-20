package com.chapter.homework02;

public class Professor extends Teacher{
    private double salaryLevel;

    public Professor(String name, int age, String post, double salary, double salaryLevel) {
        super(name, age, post, salary);
        this.salaryLevel = salaryLevel;
    }

    @Override
    public String introduce() {
        return super.introduce()+"\t"+salaryLevel;
    }
}
