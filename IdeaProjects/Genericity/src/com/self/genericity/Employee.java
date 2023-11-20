package com.self.genericity;

public class Employee<T> {
    private String name;
    private int sal;
    private T birthday;

    public Employee(String name, int sal, T birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return name + "\t" + sal + "\t" + birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public T getBirthday() {
        return birthday;
    }

    public void setBirthday(T birthday) {
        this.birthday = birthday;
    }
}
