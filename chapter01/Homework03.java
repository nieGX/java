/** 
 * 作业3：描述JDK、JRE、JVM的关系
 */
public class Homework03{
    // 程序入口 main 方法
    public static void main(String[] args){
        System.out.println("\nJDK：全称 Java Development Kit，Java开发工具包，JDK包含了JRE和一些java开发工具（java.exe、javac.exe、javap.exe、javadoc.exe、jar.exe）。\n");
        System.out.println("JRE：全称 Java Runtime Environment，Java运行环境，JRE包含了JVM和Java语言的核心类库（System.out.println）。\n");
        System.out.println("JVM：全称 Java Virtual Machine，Java虚拟机，Java运行机制：首先编写java程序文件（xxx.java），编译程序文件（xxx.class），才能在JVM中运行java程序，因为有了JVM，所以java支持跨端（Windows，Linux，Mac，Andriod）。");
    }
}