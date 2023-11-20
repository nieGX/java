package com.self.homework6;
/*
* 枚举类
* 1.创建一个Color枚举类有 RED,BLUE,BLACK,YELLOW,GREEN这个五个枚举值/对象
* 2.Color有三个属性redValue，greenValue，blueValue,
* 3.创建构造方法，参数包括这三个属性，每个枚举值都要给这三个属性赋值，
* 三个属性对应的值分别是red: 255,0,0 blue:0,0,255 black:0,0,0 yellow:255,255,0 green:0,255,0
* 7.定义接口，里面有方法show，要求Color实现该接口
* 8.show方法中显示三属性的值
* 9.将枚举对象在switch语句中匹配使用
* */
public enum Color implements IColor{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public void show(){
        System.out.println("redValue="+redValue);
        System.out.println("greenValue="+greenValue);
        System.out.println("blueValue="+blueValue);
    }
}
