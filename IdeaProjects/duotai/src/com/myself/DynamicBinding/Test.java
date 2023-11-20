package com.myself.DynamicBinding;

public class Test {
    public static void main(String[] args) {
//        java多态 动态绑定机制
        Father test1 = new Son();
//只有访问方法时有动态绑定机制：根据运行类型访问方法
//属性没有动态绑定，哪里声明哪里使用
        System.out.println(test1.getNum());
        System.out.println(test1.getStr());
        System.out.println(test1.hashCode());
        System.out.println(test1.num);
        System.out.println(test1.str);

        Son son = new Son();
        System.out.println(son.myself);
        System.out.println(son.getSelf());
    }
}
