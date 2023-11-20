package com.chapter.homework;

public class Person {
    private String name;
    private int age;
    private String job;

    public Person() {
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

//    冒泡排序

    /**
     * 按照 age 从 大到 小进行排序, 提示，使用冒泡排序
     */
    public void bubbleSort(Person[] people) {
        boolean isSort = true;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
//                前后比较
                if (people[j].age < people[j + 1].age) {
                    Person temp = people[j + 1];
                    people[j + 1] = people[j];
                    people[j] = temp;
                    isSort = false;
                }
            }
            if(isSort) break;
        }
    }
//    打印Person数组
    public void print(Person[] people){
        System.out.println("姓名\t\t年龄\t\t职业");
        for (int i = 0; i < people.length; i++) {
//            if(people[i].name.length()>2){
////                名字大于2个字符，打印一个制表符号
//                System.out.println(people[i].name+"\t"+people[i].age+"\t\t"+people[i].job);
//                continue;
//            }
//            System.out.println(people[i].name+"\t\t"+people[i].age+"\t\t"+people[i].job);
            System.out.println(people[i].toString());
        }
    }
//    重写toString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }
}
