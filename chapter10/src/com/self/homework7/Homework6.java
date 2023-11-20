package com.self.homework7;
/*
* 有一个交通工具接口类Vehicles，有work接口
* 有Horse类和Boat类分别实现Vehicles
* 创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
* 有Person类，有name和Vehicles属性，在构造器中为两个属性赋值
* 实例化Person对象“唐僧”，要求一般情况下用Horse作为交通工具,遇到大河时用Boat作为交通工具
* */
public class Homework6 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", VehicleFactory.getHorse());

        tang.road();
        tang.road();
        tang.road();
        tang.passRiver();
        tang.road();
        tang.passRiver();
        tang.passFireMountain();
        tang.road();

    }
}

class VehicleFactory{


    public static IVehicles getHorse(){
        return new Horse();
    }
    public static IVehicles getBoat(){
        return new Boat();
    }
    public static IVehicles getPlane(){
        return new Plane();
    }
}
