package com.myself.duotaiParams;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    @Override
    public double getAnnual(){
        return super.getAnnual() + this.bonus;
    }

    public void manage(){
        System.out.println(this.getName()+" 说滚，你不干有的是人干！");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
