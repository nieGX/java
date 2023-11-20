public class This {
    public static void main(String[] args) {
        Father f = new Son();
        Son s = new Son();


        System.out.println(f.name);
        System.out.println(s.name);
        f.getName();

        System.out.println(f);
        System.out.println(s);
    }
}

class Father{
    public String name = "Father";

    public Father() {
        System.out.println(this);
    }

    public void getName(){
        System.out.println("Father getName() = "+this.name);
    }
}

class Son extends Father{
    public String name = "Son";
    public Son() {
        System.out.println(this);
    }

//    public void getSonName(){
//        System.out.println("Son getSonName() = "+this.name);
//    }

}
