/**
 * 作业4：环境变量Path配置及其作用
 */
public class Homework04{
    // 程序入口 main 方法
    public static void main(String[] args){
        System.out.println("\n");
        System.out.println("如何在命令行界面使用java、javac等命令？\n");
        System.out.println("安装好JDK后，需要在此电脑->属性->高级设置->环境变量->新建变量名称JAVA_HOME，变量值为JDK的安装路径\n");
        System.out.println("然后再编辑Path变量，新建内容%JAVA_HOME%\\bin，该方法可能导致javac命令无法执行，可修改内容为JDK安装的绝对路径\\bin");
    }
}