/**
 * 本章作业：将对象作为参数传递给方法
 *
 * (1)定义一个Circle类，包含一个double类型的radius属性代表圆的半径，定义findArea()方法返回圆的面积
 * (2)定义一个类PassObject，在该类定义一个方法printArea()，public void printArea(Circle c, int times)
 * (3)在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积
 * (4)在main方法中调用printAreas方法，输出当前半径值
 */

public class Homework01{
    public static void main(String[] args){
        Circle c = new Circle();
        PassObject p = new PassObject();
        p.printArea(c,5);
    }
}

class Circle{
    double radius;
    public double findArea(){
        return Math.PI * this.radius * this.radius;
    }
    // 修改radius
    public void setRadius(double radius){
        this.radius = radius;
    }
}

class PassObject{
    public void printArea(Circle c,int times){
        System.out.println("Radius\t\tArea");
        for(int i=1;i<=times;i++){
            c.setRadius(i);
            System.out.println((double)i+"\t\t"+c.findArea());
        }
    }
}