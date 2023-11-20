package com.self.arraysort;


import java.util.Arrays;
import java.util.Comparator;

/*
*
* 案例:自定义Book类，里面包含name和price，按price排序(从大到小)。
* 要求使用两种方式排序
使用前面学习过的传递 实现Comparator接口匿名内部类，也称为定制排序。
*  可以按照 price (1)从大到小(2)从小到大(3) 按照书名长度从大到小
* */
public class ArraySort {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("红楼梦",23.6);
        books[1] = new Book("西游记",36.5);
        books[2] = new Book("三国演义",32.0);
        books[3] = new Book("水浒传",42.3);
        books[4] = new Book("将夜",45);

        System.out.println("================原始的数组========================");
        System.out.println(Arrays.toString(books));
        System.out.println("================price从大到小的数组========================");
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                double d1 = o1.getPrice();
                double d2 = o2.getPrice();
                if(d2-d1>0){
                    return 1;
                }else if(d2 - d1 <0){
                    return -1;
                }
                return 0;

            }
        });
        System.out.println(Arrays.toString(books));
        System.out.println("================price从小到大的数组========================");
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                double d1 = o1.getPrice();
                double d2 = o2.getPrice();
                if(d1-d2>0){
                    return 1;
                }else if(d1 - d2 <0){
                    return -1;
                }
                return 0;

            }
        });
        System.out.println(Arrays.toString(books));
        System.out.println("================name长度从大到小的数组========================");
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                String d1 = o1.getName();
                String d2 = o2.getName();
                if(d2.length()-d1.length()>0){
                    return 1;
                }else if(d2.length() - d1.length() <0){
                    return -1;
                }
                return 0;

            }
        });
        System.out.println(Arrays.toString(books));
    }
}
