package com.self.homework1;

public class Frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock(){
        this.serialNumber = getNextNum();
    }
    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
