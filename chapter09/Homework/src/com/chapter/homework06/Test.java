package com.chapter.homework06;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("肥贤", "男", 27, "9527");
        Teacher teacher = new Teacher("韩顺平", "男", 52, 10);
        Person person = new Person();

        System.out.println(student.play());
        System.out.println(teacher.play());

        System.out.println(teacher.print());
        System.out.println("===========================");
        System.out.println(student.print());

        Person[] people = new Person[4];
        people[0] = (new Student("jack","男",22,"1" ));
        people[1] = (new Student("mark","男",19,"2" ));
        people[2] = (new Teacher("Mike","男",32,5 ));
        people[3] = (new Teacher("Moss","女",60,10 ));

        System.out.println("===========================");
        System.out.println("年龄从大到小排序");
        person.bubbleSortByAge(people);

        for (int i = 0; i < people.length; i++) {
            System.out.println("姓名："+people[i].getName()+" 年龄："+people[i].getAge());
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName() + person.promise(people[i]));
        }

    }
}
