package com.self.arraysort;

public class Book {
    private String name;
    private double price;

    public Book(String name,double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", price=" + price;
    }
}
