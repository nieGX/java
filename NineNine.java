/** 
 * 九九乘法表
 */
public class NineNine{
    public static void main(String[] args){
        // 1.一共有9行
        // 2.每行最大列数是本轮的次数
        for(int i=1;i<=9;i++){
            // 外层循环行
            for(int j=1;j<=i;j++){
                // 内层循环列
                System.out.print(j + " * " + i + " = "+ i * j);
                // 制表符分隔列
                System.out.print("\t");
            }
            // 下一行开始
            System.out.println("");
            
        }
    }
}