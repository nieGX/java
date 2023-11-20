package com.self.homework3;

public class Cellphone {
    public void testWork(IComputer IComputer,double num1,double num2){
        double result = IComputer.work(num1,num2);
        System.out.println("testWork的结果：" + result );
    }
}
