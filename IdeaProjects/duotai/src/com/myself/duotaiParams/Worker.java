package com.myself.duotaiParams;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }
    @Override
    public double getAnnual(){
        return super.getAnnual();
    }
    public void work(){
        System.out.println(this.getName() + " 喊出工人最光荣！");
    }
}
