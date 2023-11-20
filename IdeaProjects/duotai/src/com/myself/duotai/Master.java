package com.myself.duotai;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

//    主人喂养方法
    public void onFeed(Animal animal,Food food){
        System.out.println("主人 "+this.name+" 喂宠物 "+animal.getName()+" 吃了 "+food.getName());
    }

    public String getName() {
        return name;
    }
}
