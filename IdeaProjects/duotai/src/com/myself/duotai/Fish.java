package com.myself.duotai;

public class Fish extends Food{
    private String name = "东星斑";
    public Fish(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }
}
