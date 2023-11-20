package com.chapter.homework;

/**
 * 定义一个Person类{name, age,job),初始化Person 对象数组，有3个person对象，并按照 age 从 大到 小进行排序, 提示，使用冒泡排序
 */
public class Homework01 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("雷军", 49, "小米创始人"),
                new Person("肥贤", 27, "瘦子炸鸡创始人"),
                new Person("马化腾", 52, "腾讯创始人"),
                new Person("马云", 56, "阿里巴巴创始人"),


        };

        Person person = new Person();
        person.bubbleSort(people);
        person.print(people);
    }
}
