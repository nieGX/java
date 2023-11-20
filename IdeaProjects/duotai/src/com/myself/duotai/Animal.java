package com.myself.duotai;

public class Animal {
    public String color="透明";
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sayHi(){
        System.out.println(this.name+"正在叫唤...");
    }

    public String getName() {
        return name;
    }
}
