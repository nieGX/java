package com.self.homework3;

import java.util.HashMap;

/**
 * 1)使用HashMap类实例化一个Map类型的对象m，键 (String) 和值 (int) 分别用于存储员工的姓名和工资，
 * 存入数据如下:jack-650元; tom-1200元: smith-2900元;
 * 2将jack的工资更改为2600元
 * 3为所有员工工资加薪100元:
 * 遍历集合中所有的员工
 * 遍历集合中所有的工资
 * */
@SuppressWarnings({"all"})
public class Homework3 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("jack",650);
        map.put("tom",1200);
        map.put("smith",2900);

        System.out.println("========================== HashMap ==========================");
        for (Object m : map.entrySet()) {
            System.out.println(m);
        }
        System.out.println("========================== 将jack的工资更改为2600元 ==========================");
        map.put("jack",2600);
        for (Object m : map.entrySet()) {
            System.out.println(m);
        }
        System.out.println("========================== 为所有员工工资加薪100元 ==========================");
        for (Object k : map.keySet()) {
            map.put(k,(int)map.get(k) + 100);
            System.out.println(k + "=" + map.get(k));
        }
        System.out.println("========================== 遍历集合中所有的员工 ==========================");
        for (Object k : map.keySet()) {
            System.out.println(k);
        }
        System.out.println("========================== 遍历集合中所有的工资 ==========================");
        for (Object s : map.values()) {
            System.out.println(s);
        }


    }
}

