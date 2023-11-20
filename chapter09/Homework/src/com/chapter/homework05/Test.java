package com.chapter.homework05;

public class Test {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("钟南山", 74, "专家", "男", 2300);
        Doctor doctor2 = new Doctor("钟南山", 74, "专家", "男", 2300);
        Doctor doctor3 = new Doctor("终南山", 24, "庸医", "男", 10000);

        System.out.println("doctor1==doctor2 "+doctor1.equals(doctor2));
        System.out.println("doctor1==doctor3 "+doctor1.equals(doctor3));
        System.out.println("doctor1==doctor1 "+doctor1.equals(doctor1));

        C c = new C();
    }
}

class A{
    public A(){
        System.out.println("我是A类");
    }
}

class B extends A{
    public B(){
        System.out.println("我是B类的无参构造");
    }

    public B(String name){
        System.out.println(name+"我是B类的有参构造");
    }
}

class C extends B{
    public C(){
        this("hahah");
        System.out.println("我是C类的无参构造");
    }
    public C(String name){
        super(name);
        System.out.println("我是C类的有参构造");
    }
}

