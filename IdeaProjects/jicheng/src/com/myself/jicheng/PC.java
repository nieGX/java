package com.myself.jicheng;

public class PC extends Computer{
    public String brand;
    public PC(String CPU,int memory,int disk, String brand){
        super(CPU,memory,disk);
        this.brand=brand;
    }
}
