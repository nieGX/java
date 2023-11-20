public class This{
    public static void main(String[] args){

        Father f = new Son();
        Son s = new Son();


        System.out.println(f.name);
        System.out.println(s.name);

        f.getName();
        f.getSonName();

    }
}

class Father{
    public String name = "Father";
    public void getName(){
        System.out.println("Father getName() = "+this.name);
    }
}

class Son extends Father{
    public String name = "Son";

    public void getSonName(){
        System.out.println("Son getSonName() = "+this.name);
    }

}