/**
 * ������ҵ
 */
public class Homework04{
        /** 
        * 1.�ڲ��Է����У�����method�������������£�������ȷ����д��method�����Ķ�����ʽ
        * �������Ϊ: System.out.println(method(method(10.0,20.0),100));
        */
       public static double method(double num1,double num2){
        return num1 + num2;
       }

    public static void main(String[] args){

        // 1.
        System.out.println("1 ===========================================================");
       System.out.println("method�ķ��ؽ�� = "+method(method(10.0,20.0),100));

         // 2.
        System.out.println("2 ===========================================================");
        Employee p1 = new Employee("����",'��',48,"��Ѷ�ܲ�",1.00);
        Employee p2 = new Employee("����",'��',54);
        Employee p3 = new Employee("С�׶��³�",1999);

        System.out.println("p1Ա����"+p1.name);
        System.out.println("p2Ա����"+p2.name);
        System.out.println("p3Ա����"+p3.position);
    }
}

/**
 * 2.����һ��Employee�࣬ ������(���֣��Ա����䣬ְλ��нˮ)�� �ṩ3�����췽�������Գ�ʼ��
 * (1)(���֣��Ա����䣬ְλ��нˮ),
 * (2)(���֣��Ա�����)
 * (3)(ְλ��нˮ)
 * 
 * Ҫ���ָ��ù�����
 */
class Employee{
    String name;
    char gender;
    int age;
    String position;
    double salary;

    // ������1
    public Employee(String name, char gender, int age, String position, double salary){
        // this.name = name;
        // this.gender = gender;
        // this.age = age;
        // this.position = position;
        // this.salary = salary;
        // 
        // �����������������������
        // this(name,gender,age);
        // this(position,salary); ����ᱨ����Ϊthis���ù���������������ڿ�ͷ��һ�䣬�����ط����ö��ᱨ��
        // ���ֻ�ܸ�������һ��
        this(name,gender,age);
        this.position = position;
        this.salary = salary;
        
    }

    // ������2
    public Employee(String name, char gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // ������3
    public Employee(String position, double salary){
        this.position = position;
        this.salary = salary;
    }
}
