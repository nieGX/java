/**
 * ������ҵ
 */

public class Homework02{
    public static void main(String[] args){
        // 1.
        System.out.println("1 ===============================================================");
        double[] arr = {1.0,0.3,0.8,0.66,1.5,1.1};
        A01 a01 = new A01();
        System.out.println("[1.0,0.3,0.8,0.66,1.5,1.1]�е����ֵ�ǣ�"+a01.findMax(arr));

        // 2.
         System.out.println("2 ===============================================================");
        String[] s = {"jack","rose","pony"};
        String name = "marry";
        A02 a02 = new A02();
        int res = a02.find(name,s);
        System.out.println("{jack,rose,pony}");
        if(res>-1){
            System.out.println("�ҵ���"+name+"�ڵ�"+(res+1)+"λ");
        }else{
            System.out.println("û���ҵ�"+name+"\t"+res);
        }

        // 3.
         System.out.println("3 ===============================================================");
         Book b = new Book();
         System.out.println("����\t\t\t\t�۸�");
         System.out.println(b.name+"\t"+b.price);
         System.out.println("���º�ļ۸�");
         b.updatePrice(199);
         System.out.println("����\t\t\t\t�۸�");
         System.out.println(b.name+"\t"+b.price);

    }
}

// 1.��д��A01�����巽��max��ʵ����ĳ��double��������ֵ��������
class A01{
    public double findMax(double[] arr){
        double maxNum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxNum){
                maxNum = arr[i];
            }
        }
            return maxNum;
    }
}

// 2.��д��A02�����巽��find��ʵ�ֲ���ĳ�ַ��������е�Ԫ�ز��ң���������������Ҳ���������-1
class A02{
    public int find(String str ,String[] s){
        int index = -1;
        for(int i=0;i<s.length;i++){
            if(s[i].equals(str)){
                index = i;
                break;
            }
        }
        return index;
    }
}

// 3.��д��Book�����巽��updatePrice��ʵ�ָ���ĳ����ļ۸񣬾���: ����۸�>150,�����Ϊ150������۸�>100,����Ϊ100�����򲻱�
class Book{
    String name = "��JavaScript�����ŵ�������";
    double price = 78.9;
    public void updatePrice(double price){
        if(price>150){
            this.price = 150;
        }else if(price>100){
             this.price = 100;
        }
    }
}