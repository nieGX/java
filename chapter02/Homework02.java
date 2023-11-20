/**
 *
 * 作业2：
 * (1)保存两本书名，用+号拼接，看效果；
 * (2)保存两个性别，用+号拼接，看效果；
 * (3)保存两本书价格，用+号拼接，看效果；
 */
public class Homework02{
    public static void main(String[] args){
        // (1)
        String book1 = "西游记";
        String book2 = "三国演义";

        System.out.println(book1+book2);// + 号表示字符串拼接 "西游记三国演义"

        // (2)
        char gender1='男';
        char gender2='女';
        System.out.println(gender1+gender2); // 由于char类型运算时，自动提升为int类型，所以结果是字符男和字符女对应的unicode编码相加的和，30007(男)+22899(女)=52906

        // (3)
        int price1 = 99;
        int price2 = 199;
        System.out.println(price1+price2);// 数字相加 99+199=298
    }
}