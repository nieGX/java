package com.self.homework2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 使用ArrayList 完成对 对象 Car [name, price} 的各种操作
 * Car car = new Car("宝马”，400000):Car car2 = new Car("宾利”，5000000)
 * 1.add:添加单个元素
 * 2.remove:删除指定元素
 * 3.contains:查找元素是否存在
 * 4.size:获取元素个数
 * 5.isEmpty:判断是否为空
 * 6.clear:清空
 * 7.addAll:添加多个元素
 * 8.containsAll:查找多个元素是否都存在
 * 9.removeAll: 删除多个元素
 * 使用增强for和 迭代器来遍历所有的car，需要重写 Car 的toString方法
 * */
public class Homework2 {
    public static void main(String[] args) {
        Car car1 = new Car("宝马", 300000);
        Car car2 = new Car("奔驰", 330000);
        Car car3 = new Car("奥迪", 280000);
        Car car4 = new Car("凯迪拉克", 275000);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(new Car("玛莎拉蒂",800000));

        System.out.println("====================车库==========================");
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("==================== remove car4 ==========================");
        cars.remove(car4);
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("==================== contains car1 ==========================");
        System.out.println(cars.contains(car1));
        System.out.println("==================== size ==========================");
        System.out.println(cars.size());
        System.out.println("==================== isEmpty ==========================");
        System.out.println(cars.isEmpty());
        System.out.println("==================== clear ==========================");
        cars.clear();
        System.out.println(cars);
        System.out.println("==================== addAll ==========================");
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("劳斯莱斯",8000000));
        carList.add(new Car("法拉利",3000000));
        carList.add(new Car("兰博基尼",7000000));
        cars.addAll(carList);
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("==================== containsAll ==========================");
        System.out.println(cars.containsAll(carList));
        carList.add(new Car("保时捷",3500000));
        System.out.println(cars.containsAll(carList));

        System.out.println("==================== removeAll ==========================");
        cars.add(new Car("阿波罗",10000000));
        cars.removeAll(carList);
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car next =  iterator.next();
            System.out.println(next);
        }

    }
}

class Car{
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "\t" + price;
    }
}
