package com.self.homework;

import org.junit.jupiter.api.Test;

/**
 *
 * 定义个泛型类 DAO<T>，在其中定义一个Map 成员变量，Map 的键为 String 类型，值为 T类型
 * 分别创建以下方法:(1) public void save(String id,T entity): 保存T 类型的对象到 Map 成员变量中
 * (2) public T get(String id): 从 map 中获取 id 对应的对象
 * (3) public void update(String id,T entity): 替换 map 中key为id的内容,改为 entity 对象
 * (4) public List<T> list0: 返回 map 中存放的所有 T 对象
 * (5) public void delete(String id): 删除指定 id 对象
 * 定义一个 User 类:该类包含: private成员变量 (int类型) id，age,(String 类型) name;
 * 创建 DAO 类的对象，分别调用其 save、get、update、list、delete 方法来操作 User 对象使用 Junit 单元测试类进行测试。
 * */
public class Homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void unitTest(){
        DAO<User> userDAO = new DAO<>();
        System.out.println("========================= save =========================");
        userDAO.save("1",new User(1,"jack",23));
        userDAO.save("2",new User(2,"rose",26));
        userDAO.save("3",new User(3,"tom",25));
        System.out.println("========================= get =========================");
        System.out.println(userDAO.get("2"));
        System.out.println("========================= remove =========================");
        userDAO.delete("1");
        System.out.println("========================= update =========================");
        userDAO.update("1",new User(1,"lisa",18));
        System.out.println("========================= list =========================");
        System.out.println(userDAO.list());
    }
}
