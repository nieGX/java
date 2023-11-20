/**
 *
 * 作业3：编程实现如下效果：
 * 姓名   年龄  成绩  性别  爱好
 * XX     xx    xx   xx    xx
 * 
 * (1)用变量将姓名，年龄，成绩，性别，爱好存储；
 * (2)使用 + ；
 * (3)添加适当的注释；
 * (4)添加转义字符，在一行打印输出；
 */
public class Homework03{
    public static void main(String[] args){
        // 姓名
        String name = "肥贤";
        // 年龄
        int age = 27;
        // 性别
        String gender = "不明";
        // 成绩
        double score = 159.9;
        // 爱好
        String hobby = "唱，跳，rap，篮球";

        System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n"+name+"\t"+age+"\t"+score+"\t"+gender+"\t"+hobby);
    }
}