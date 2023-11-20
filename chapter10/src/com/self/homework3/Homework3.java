package com.self.homework3;

public class Homework3 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork( new IComputer(){
            @Override
            public double work(double num1,double num2) {
                return num1 + num2;
            }
        },1,2);

        cellphone.testWork( new IComputer(){
            @Override
            public double work(double num1,double num2) {
                return num1 * num2;
            }
        },1,2);
    }
}
