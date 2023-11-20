/**
 * 包：本质就是文件夹
 * 作用：把众多的类文件或相同模块下的类统一放到某个包下进行管理
 * 1.包避免了同名类的冲突
 * 2.包控制了类的访问范围
 *
 * 使用：
 * 把类文件放到包中，需要在类文件的第一行代码添加[package[空格符]包的路径]
 * 注意，一个类文件只能包含一个package关键字
 *
 * 如果要使用其它包中的类，需要引入包，[import 包的路径]
 * import需要放在package和class之间
 * */
package com.myself.test;

//引入其他包下的类
import com.myself.other.Utils;
public class Package01 {
    public static void main(String[] args){
        Utils myUtils = new Utils();
        int[] arr = {1,2,3,-1,0};
        System.out.println("排序前的数组============");
        myUtils.printArray(arr);
        myUtils.ArraySort(arr);
        System.out.println("排序后的数组============");
        myUtils.printArray(arr);
    }
}
