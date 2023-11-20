package com.myself.utils;
import java.util.Scanner;
public class Utils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readString(){
        return scanner.next();
    }

    public static char readStringFirst(){
        return scanner.next().charAt(0);
    }

    public static int readInt(){ return scanner.nextInt(); }

    public static String readStringLine(){ return scanner.nextLine();}
}
