public class Test {
    public static void main(String[] args) {
        Person person = new Person("张三");
        changePersonName(person);
        System.out.println(person.getName()); // 输出：张三
    }

    public static void changePersonName(Person person) {
        person.setName("李四");
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

