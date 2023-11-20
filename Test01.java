public class Test01{
    public static void main(String[] args){
        
        Cat cat1 = new Cat();
        cat1.name="Ð¡»¨";
        cat1.age=10;

        test(cat1);

        System.out.println(cat1.age);

        System.out.println(0.1+0.2);

       

    }

    public static void test(Cat a){
        a.age= 100;
    }
}

class Cat{
    String name;
    int age;
}

