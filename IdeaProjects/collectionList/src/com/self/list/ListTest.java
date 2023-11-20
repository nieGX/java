package com.self.list;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all"})
public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦","曹雪芹",67));
        list.add(new Book("西游记","吴承恩",100));
        list.add(new Book("三国志","罗贯中",88));
        list.add(new Book("水浒传","施耐庵",75));

        for (Object book :list) {
            System.out.println(book);
        }

        System.out.println("====================排序后====================");

        listSort(list);

        for (Object book :list) {
            System.out.println(book);
        }

    }

    public static void listSort(List list){
        int len = list.size();

        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-1-i; j++) {
                Book b1 = (Book)list.get(j);
                Book b2 = (Book)list.get(j+1);

                if(b1.getPrice() > b2.getPrice()){
                    list.set(j,b2);
                    list.set(j+1,b1);
                }
            }
        }
    }
}
