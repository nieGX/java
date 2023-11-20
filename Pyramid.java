/**
 * 打印金字塔 Pyramid
 */
public class Pyramid{
    public static void main(String[] args){

        // 半个金字塔
        // 行数
        int rowNum = 5;
        for(int i=0;i<rowNum;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        // 正金字塔
        int rowNum2=5;
        for(int i=1;i<=rowNum2;i++){
            // 打印空格，数量是最大行数-当前行数
            for(int k=1;k<=rowNum2-i;k++){
                System.out.print(" ");
            }
            // 内层循环终止条件数值是：当前行数+上一轮行数
            for(int j=1;j<=i+(i-1);j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        // 菱形
        int rowNum3 = 9;
        // 分界线
        int middleNum = (rowNum3 / 2) + 1;
        for(int i=1;i<=rowNum3;i++){
            // 打印空格，数量是(分界线数值 - 当前行数)的绝对值
            for(int k=1;k<=Math.abs(middleNum-i);k++){
                System.out.print(" ");
            }
            if(i<=middleNum){
                // 内层循环终止条件数值是：当前行数+上一轮行数
            for(int j=1;j<=i+(i-1);j++){
                System.out.print("*");
            }
        }else{
            // 内层循环终止条件数值是：当前行数+上一轮行数
            for(int j=1;j<=middleNum+(middleNum - i)+(middleNum+(middleNum - i)-1);j++){
                System.out.print("*");
            }}
             System.out.println("");
            
        }
       
        
    }
}