/**
 * 本章作业
 */

public class Homework02{
    public static void main(String[] args){
        // 1.
        System.out.println("1 ===============================================================");
        double[] arr = {1.0,0.3,0.8,0.66,1.5,1.1};
        A01 a01 = new A01();
        System.out.println("[1.0,0.3,0.8,0.66,1.5,1.1]中的最大值是："+a01.findMax(arr));

        // 2.
         System.out.println("2 ===============================================================");
        String[] s = {"jack","rose","pony"};
        String name = "marry";
        A02 a02 = new A02();
        int res = a02.find(name,s);
        System.out.println("{jack,rose,pony}");
        if(res>-1){
            System.out.println("找到了"+name+"在第"+(res+1)+"位");
        }else{
            System.out.println("没有找到"+name+"\t"+res);
        }

        // 3.
         System.out.println("3 ===============================================================");
         Book b = new Book();
         System.out.println("书名\t\t\t\t价格");
         System.out.println(b.name+"\t"+b.price);
         System.out.println("更新后的价格");
         b.updatePrice(199);
         System.out.println("书名\t\t\t\t价格");
         System.out.println(b.name+"\t"+b.price);

    }
}

// 1.编写类A01，定义方法max，实现求某个double数组的最大值，并返回
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

// 2.编写类A02，定义方法find，实现查找某字符串数组中的元素查找，并返回索引如果找不到，返回-1
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

// 3.编写类Book，定义方法updatePrice，实现更改某本书的价格，具体: 如果价格>150,则更改为150，如果价格>100,更改为100，否则不变
class Book{
    String name = "《JavaScript从入门到放弃》";
    double price = 78.9;
    public void updatePrice(double price){
        if(price>150){
            this.price = 150;
        }else if(price>100){
             this.price = 100;
        }
    }
}