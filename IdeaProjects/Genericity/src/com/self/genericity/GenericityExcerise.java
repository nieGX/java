package com.self.genericity;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 泛型课堂练习题
 * 泛型课堂类型
 * 定义Employee类
 * 1)该类包含: private成员变量name,sal,birthday，其中 birthday 为 MyDate 类的对象;
 * 2) 为每一个属性定义 getter, setter 方法;
 * 3) 重写 toString 方法输出 name, sal, birthday
 * 4)MyDate类包含: private成员变量month,day,year; 并为每一个属性定义 getter,.setter 方法:
 * 5)创建该类的 3 个对象，并把这些对象放入 ArrayList 集合中 (ArrayList 需使用泛型来定义)，对集合中的元素进行排序，并遍历输出:
 * 调用ArrayList 的 sort 方法，传入 Comparator对象[使用泛型]
 * 先按照排序方式:name排序，如果name相同，则按生日日期的先后排序。[即: 定制排序]
 * */
public class GenericityExcerise {
    public static void main(String[] args) {
        ArrayList<Employee<Birthday>> list = new ArrayList<>();
        list.add(new Employee<Birthday>("jack",7000,new Birthday(1990,12,12)));
        list.add(new Employee<Birthday>("smith",8000,new Birthday(1993,5,11)));
        list.add(new Employee<Birthday>("rose",6000,new Birthday(1995,2,6)));
        list.add(new Employee<Birthday>("lisa",4800,new Birthday(1995,10,20)));
        list.add(new Employee<Birthday>("jack",15000,new Birthday(1990,12,23)));

        System.out.println("===================== Employee List =====================");
        for (Employee<Birthday> emp : list) {
            System.out.println(emp);
        }
        System.out.println("===================== 排序后 =====================");
        list.sort(new Comparator<Employee<Birthday>>() {
            @Override
            public int compare(Employee<Birthday> o1, Employee<Birthday> o2) {



                if(!(o1.getName().equals(o2.getName()))){
                    return o1.getName().compareTo(o2.getName());
                }else{
//                    return o1.getBirthday().toString().compareTo(o2.getBirthday().toString());
                    return o1.getBirthday().compareTo(o2.getBirthday());
                }
            }
        });
        for (Employee<Birthday> emp : list) {
            System.out.println(emp);
        }

    }
}
