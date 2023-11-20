// 转义字符
public class ChangeChar{
    public static void main (String[] args){
        // \t 制表符，以相同的间距隔开
        System.out.println("Jack\tRose\tMark");
        // \n 换行符，换行输出
        System.out.println("Jack\nRose\nMark");
        // \r 回车符，会把光标定位到开始位置，并且用后面的字符替换前面相同数量的字符
        System.out.println("为什么要这样？\r啊啊"); // 啊啊么要这样？
        System.out.println("为什么要这样？\r\n啊啊");// 为什么要这样？啊啊

        // \" 单个双引号
        System.out.println("他说：\"JAVA泰酷辣！\"");
        // \' 单个单引号
        System.out.println("他说：\'噢！卑鄙！\'");
            // \\ 单个\斜杠符号
            System.out.println("D:\\\\1024\\java");


            // 作业
            System.out.println("\n书名\t作者\t价格\t销量\n三国\t罗贯中\t89\t9999\n");

    }
}