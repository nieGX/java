/**
 * ������ҵ����������Ϊ�������ݸ�����
 *
 * (1)����һ��Circle�࣬����һ��double���͵�radius���Դ���Բ�İ뾶������findArea()��������Բ�����
 * (2)����һ����PassObject���ڸ��ඨ��һ������printArea()��public void printArea(Circle c, int times)
 * (3)��printAreas�����д�ӡ���1��times֮���ÿ�������뾶ֵ���Լ���Ӧ��������磬timesΪ5��������뾶1��2��3��4��5���Լ���Ӧ��Բ���
 * (4)��main�����е���printAreas�����������ǰ�뾶ֵ
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
    // �޸�radius
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