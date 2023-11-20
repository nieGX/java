package com.myself.jicheng;

public class Computer {
    protected String CPU;
    protected int memory;
    protected int disk;

    public Computer(String CPU,int memory,int disk){
        this.CPU = CPU;
        this.memory=memory;
        this.disk=disk;
    }

    public void getDetails(){
        System.out.println("CPU:"+this.CPU);
        System.out.println("内存:"+this.memory);
        System.out.println("硬盘:"+this.disk);
    }
}
