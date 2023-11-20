package com.myself.duotai;

public class DUOTAI {
    public static void main(String[] args) {
//        传统方法，未体现多态
        Master master = new Master("肥贤");
        Dog dog = new Dog("哈士奇1号");
        Bone bone = new Bone("大棒骨");

        master.onFeed(dog,bone);
        System.out.println("============================");
//        体现多态的做法
//        向上转型：变量类型是父类型，但是new的是子类对象
//        左边变量：编译类型；右边值：运行类型
//        编译类型是相对编译器来说的，也就是开发时
//        运行类型是在代码运行时，交给jvm来用的
        Animal animal = new Cat("狸花猫");
//        向上转型中，能够访问父类Animal的所有方法，但不能访问Cat类独有的方法
//        animal.catchMouse();
//        如果父类和子类都有这个方法，会调用子类的方法（还要遵守访问修饰符的限制）
        animal.sayHi();

//        向下转型：强制把父类引用的子类对象转换为子类型
        Cat myCat = (Cat)animal;
//        向下转型可以访问子类的所有方法
        myCat.catchMouse();
        myCat.sayHi();

//        多态中，如果存在相同的属性，统一按照编译类型去访问
        System.out.println(animal.color);
        System.out.println(myCat.color);

//        多态喂食
//        Fish fish = new Fish("小鱼");
        master.onFeed(animal,new Fish("小鱼"));
    }
}
