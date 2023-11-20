/**
 * 本章作业
 */
public class Homework03{
    public static void main(String[] args){
        // 1.
        System.out.println("1 ====================================================");
        A03 a03 = new A03();
        // int[] old = {10,2,30,4,50};
        // System.out.println("旧数组 = {10,2,30,4,50}");
        // int[] res = a03.copyArr(old);
        // 
        // double[] old = {1.1,2.2,3.3};
        // System.out.println("旧数组 = {1.1,2.2,3.3}");
        // double[] res = a03.copyArr(old);
        
        String[] old = {"jack","rose","mark"};
        System.out.println("旧数组 = {jack,rose,mark}");
        String[] res = a03.copyArr(old);

        System.out.print("新数组 = ");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
         System.out.println();

         // 2.
          System.out.println("2 ====================================================");
          Circle c1 = new Circle(2);
          System.out.println("半径："+c1.radius);
          System.out.println("周长："+c1.getPerimeter());
          System.out.println("面积："+c1.getArea());

          // 3.
           System.out.println("3 ====================================================");
           Cale cale1 = new Cale(10,5);
           System.out.println("操作数1："+cale1.num1+" 操作数2："+cale1.num2);
           System.out.println("求和："+cale1.getSum());
           System.out.println("求差："+cale1.getDiff());
           System.out.println("求积："+cale1.getProduct());
           System.out.println("求商："+cale1.getQuotient());

           Cale cale2 = new Cale(5,10);
           System.out.println("操作数1："+cale2.num1+" 操作数2："+cale2.num2);
           System.out.println("求和："+cale2.getSum());
           System.out.println("求差："+cale2.getDiff());
           System.out.println("求积："+cale2.getProduct());
           System.out.println("求商："+cale2.getQuotient());
    }
}

// 1.编写类A03,实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样
class A03{
    public int[] copyArr(int[] old){
        // 声明一个新数组，长度和旧数组一样
        int[] newArr = new int[old.length];
        for(int i=0;i<newArr.length;i++){
            // 遍历新数组
            // 把旧数组中相同下标的元素赋值给新数组
            newArr[i] = old[i];
        }
        return newArr;
    }

    // 重载
    public double[] copyArr(double[] old){
        double[] newArr = new double[old.length];
        for(int i=0;i<newArr.length;i++){
            newArr[i] = old[i];
        }
        return newArr;
    }

    // 重载
    public String[] copyArr(String[] old){
        String[] newArr = new String[old.length];
        for(int i=0;i<newArr.length;i++){
            newArr[i] = old[i];
        }
        return newArr;
    }
}

// 2.定义一个圆类Circle,定义属性: 半径，提供显示圆周长功能的方法，提供显示圆面积的方法
class Circle{
    double radius;
    // 构造器
    public Circle(double radius){
        this.radius=radius;
    }

    // 计算周长
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    // 计算面积
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
}

// 3.编程创建一个Cale计算类，在其中定义2个变量表示两个操作数
// 定义四个方法实现求和、差、乘、商(要求除数为0的话，要提示)并创建两个对象，分别测试
class Cale{
    double num1;
    double num2;

    // 构造器
    public Cale(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
    }

    // 求和
    public double getSum(){
        return this.num1+this.num2;
    }

    // 求差
    public double getDiff(){
        return this.num1 - this.num2;
    }

    // 求乘积
    public double getProduct(){
        return this.num1*this.num2;
    }

    // 求商
    public Double getQuotient(){
        if(this.num2==0){
            System.out.println("除数不能为0！");
            return null;
        }
         return this.num1 / this.num2;
    }
}