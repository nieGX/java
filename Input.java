import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        // 1.引入Scanner类，并创建Scanner对象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        // 2.使用Scanner的相关方法获取键盘输入
        String name = myScanner.next();
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        System.out.println("请输入成绩：");
        double score = myScanner.nextDouble();

        System.out.println("姓名\t年龄\t成绩\n"+name+"\t"+age+"\t"+score);
    }
}