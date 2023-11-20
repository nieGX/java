package com.myself.duotai;

public class Cat extends Animal{
    public String color="黄黑";
    public Cat(String name) {
        super(name);
    }
//    重写父类方法
    @Override
    public void sayHi(){
        System.out.println(this.getName() + " 喵喵喵~~~ ");
    }

    public void catchMouse(){
        System.out.println(this.getName()+" 抓到了一只老鼠");
    }
}
