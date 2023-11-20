package com.self.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@SuppressWarnings({"all"})
public class MyCollection {
    public static void main(String[] args) {
        Collection List = new ArrayList();
        List.add(new Dog("哈士奇",6));
        List.add(new Dog("萨摩耶",3));
        List.add(new Dog("柯基",5));

//        1.用迭代器遍历 快捷命令 itit
        System.out.println("=======================迭代器iterator==========================");
        Iterator iterator = List.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        2.用增强for遍历
        System.out.println("=======================增强for==========================");
        List.add("test");
        for(Object o: List){
            System.out.println(o);
        }

    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "{" + this.name + "," + this.age + "}";
    }
}
