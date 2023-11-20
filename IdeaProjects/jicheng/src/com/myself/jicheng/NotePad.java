package com.myself.jicheng;

public class NotePad extends Computer{
    public String color;
    public NotePad(String CPU,int memory,int disk,String color){
        super(CPU,memory,disk);
        this.color=color;
    }
}
