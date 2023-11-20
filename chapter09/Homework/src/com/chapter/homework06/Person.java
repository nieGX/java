package com.chapter.homework06;
/**
 * 抽取一个父类Person类，将共同属性和方法放到Person类
 * */
public class Person {
    private String name;
    private String sex;
    private int age;

    public Person(String name,String sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Person(){

    }

    public String play(){
        return this.name + "爱玩";
    }

    public String print(){
        return this.toString();
    }


    @Override
    public String toString(){
        return"姓名："+this.name+"\n"+"年龄："+this.age+"\n"+"性别："+this.sex+"\n";
    }

    public String promise(Person p){
        if(p instanceof Student){
            Student s = (Student) p;
            return s.study();
        }

        if(p instanceof Teacher){
            Teacher s = (Teacher) p;
            return s.teach();
        }
        return null;
    }

    public void bubbleSortByAge(Person[] people){
        boolean isSort = true;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if(people[j].age<people[j+1].age){
                    Person temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                    isSort = false;
                }
            }

            if(isSort){
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}
