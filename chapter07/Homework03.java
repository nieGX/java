/**
 * ������ҵ
 */
public class Homework03{
    public static void main(String[] args){
        // 1.
        System.out.println("1 ====================================================");
        A03 a03 = new A03();
        // int[] old = {10,2,30,4,50};
        // System.out.println("������ = {10,2,30,4,50}");
        // int[] res = a03.copyArr(old);
        // 
        // double[] old = {1.1,2.2,3.3};
        // System.out.println("������ = {1.1,2.2,3.3}");
        // double[] res = a03.copyArr(old);
        
        String[] old = {"jack","rose","mark"};
        System.out.println("������ = {jack,rose,mark}");
        String[] res = a03.copyArr(old);

        System.out.print("������ = ");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
         System.out.println();

         // 2.
          System.out.println("2 ====================================================");
          Circle c1 = new Circle(2);
          System.out.println("�뾶��"+c1.radius);
          System.out.println("�ܳ���"+c1.getPerimeter());
          System.out.println("�����"+c1.getArea());

          // 3.
           System.out.println("3 ====================================================");
           Cale cale1 = new Cale(10,5);
           System.out.println("������1��"+cale1.num1+" ������2��"+cale1.num2);
           System.out.println("��ͣ�"+cale1.getSum());
           System.out.println("��"+cale1.getDiff());
           System.out.println("�����"+cale1.getProduct());
           System.out.println("���̣�"+cale1.getQuotient());

           Cale cale2 = new Cale(5,10);
           System.out.println("������1��"+cale2.num1+" ������2��"+cale2.num2);
           System.out.println("��ͣ�"+cale2.getSum());
           System.out.println("��"+cale2.getDiff());
           System.out.println("�����"+cale2.getProduct());
           System.out.println("���̣�"+cale2.getQuotient());
    }
}

// 1.��д��A03,ʵ������ĸ��ƹ���copyArr����������飬����һ�������飬Ԫ�غ;�����һ��
class A03{
    public int[] copyArr(int[] old){
        // ����һ�������飬���Ⱥ;�����һ��
        int[] newArr = new int[old.length];
        for(int i=0;i<newArr.length;i++){
            // ����������
            // �Ѿ���������ͬ�±��Ԫ�ظ�ֵ��������
            newArr[i] = old[i];
        }
        return newArr;
    }

    // ����
    public double[] copyArr(double[] old){
        double[] newArr = new double[old.length];
        for(int i=0;i<newArr.length;i++){
            newArr[i] = old[i];
        }
        return newArr;
    }

    // ����
    public String[] copyArr(String[] old){
        String[] newArr = new String[old.length];
        for(int i=0;i<newArr.length;i++){
            newArr[i] = old[i];
        }
        return newArr;
    }
}

// 2.����һ��Բ��Circle,��������: �뾶���ṩ��ʾԲ�ܳ����ܵķ������ṩ��ʾԲ����ķ���
class Circle{
    double radius;
    // ������
    public Circle(double radius){
        this.radius=radius;
    }

    // �����ܳ�
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    // �������
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
}

// 3.��̴���һ��Cale�����࣬�����ж���2��������ʾ����������
// �����ĸ�����ʵ����͡���ˡ���(Ҫ�����Ϊ0�Ļ���Ҫ��ʾ)�������������󣬷ֱ����
class Cale{
    double num1;
    double num2;

    // ������
    public Cale(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
    }

    // ���
    public double getSum(){
        return this.num1+this.num2;
    }

    // ���
    public double getDiff(){
        return this.num1 - this.num2;
    }

    // ��˻�
    public double getProduct(){
        return this.num1*this.num2;
    }

    // ����
    public Double getQuotient(){
        if(this.num2==0){
            System.out.println("��������Ϊ0��");
            return null;
        }
         return this.num1 / this.num2;
    }
}