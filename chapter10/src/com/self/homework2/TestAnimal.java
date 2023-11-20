package com.self.homework2;
/**
 * 动物类Animal包含了抽象方法 shout();
 * Cat类继承了Animal，并实现方法shout.打印“猫会喵喵叫”
 * Dog类继承了Animal，并实现方法shout，打印“狗会汪汪叫
 * 在测试类中实例化对象Animal cat =new Cat(),并调用cat的shout方法
 * 在测试类中实例化对象Animal dog=new Dog()并调用dog的shout方法
 *
 * */
public class TestAnimal {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.shout();
        dog.shout();
    }
}
