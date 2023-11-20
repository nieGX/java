package com.self.homework4;
/*
* 内部类
* 编一个类A，在类中定义局部内部类B，B中有一个私有final常量name，有一个方法show打印常量name,进行测试
* 进阶: A中也定义一个私有的变量name，在show方法中打印测试
* */
public class A {
    private final String NAME = "AA";

    public void f1(){
         class B{
            private final String NAME="BB";
            public void show(){
                System.out.println("内部类NAME="+this.NAME+'\t'+"外部类NAME="+A.this.NAME);
            }
        }

        B b = new B();
         b.show();
    }



}
