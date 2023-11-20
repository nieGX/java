package com.self.homework6;

public class Homework6 {
    public static void main(String[] args) {
        Color color = Color.BLACK;
        color.show();
        switch (color){

            case RED:
                System.out.println("匹配到红色");
                break;
            case GREEN:
                System.out.println("匹配到绿色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
        }
    }
}
