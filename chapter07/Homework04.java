/**
 * 本章作业
 */
public class Homework04{
        /** 
        * 1.在测试方法中，调用method方法，代码如下，编译正确，试写出method方法的定义形式
        * 调用语句为: System.out.println(method(method(10.0,20.0),100));
        */
       public static double method(double num1,double num2){
        return num1 + num2;
       }

    public static void main(String[] args){

        // 1.
        System.out.println("1 ===========================================================");
       System.out.println("method的返回结果 = "+method(method(10.0,20.0),100));

         // 2.
        System.out.println("2 ===========================================================");
        Employee p1 = new Employee("马化腾",'男',48,"腾讯总裁",1.00);
        Employee p2 = new Employee("马云",'男',54);
        Employee p3 = new Employee("小米董事长",1999);

        System.out.println("p1员工："+p1.name);
        System.out.println("p2员工："+p2.name);
        System.out.println("p3员工："+p3.position);
    }
}

/**
 * 2.创建一个Employee类， 属性有(名字，性别，年龄，职位，薪水)， 提供3个构造方法，可以初始化
 * (1)(名字，性别，年龄，职位，薪水),
 * (2)(名字，性别，年龄)
 * (3)(职位，薪水)
 * 
 * 要求充分复用构造器
 */
class Employee{
    String name;
    char gender;
    int age;
    String position;
    double salary;

    // 构造器1
    public Employee(String name, char gender, int age, String position, double salary){
        // this.name = name;
        // this.gender = gender;
        // this.age = age;
        // this.position = position;
        // this.salary = salary;
        // 
        // 复用下面的两个构造器即可
        // this(name,gender,age);
        // this(position,salary); 这里会报错，因为this调用构造器方法必须放在开头第一句，其它地方调用都会报错
        // 因此只能复用其中一个
        this(name,gender,age);
        this.position = position;
        this.salary = salary;
        
    }

    // 构造器2
    public Employee(String name, char gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // 构造器3
    public Employee(String position, double salary){
        this.position = position;
        this.salary = salary;
    }
}
