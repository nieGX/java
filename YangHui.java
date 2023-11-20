/**
 * 打印杨辉三角
 * 1
 * 1 1
 * 1 2  1
 * 1 3  3 1
 * 1 4  6 4  1
 * 1 5 10 10 5 1
 *
 * 注意观察规律：
 * (1)每一行的第一个和最后一个元素都是 1
 * (2)从第3行开始第2列开始，当前列的值为 上一行当前列 + 上一行前一列
 * 
 */
public class YangHui{
    public static void main (String[] args){
        // 打印10行的杨辉三角
        int len = 10;
        // 声明一个 10 行的，还不确定列数的二维数组
        int [][] yanghui = new int [len][];

        // 开始打印
        for(int i=0;i<yanghui.length;i++){
             // 给二维数组中的每个元素申请一个空间,长度为 i + 1
                yanghui[i] = new int[i+1];
            for(int j=0;j<=i;j++){
                // 从第3行开始才有规律，前两行都是 1
               // if(i<2){
               //  yanghui[i][j] = 1;
               //  System.out.print(yanghui[i][j] + "\t");
               // }else{
               // 根本不需要判断 i < 2 因为 j==0 和 j== i 已经包含了 i < 2 的情况
               // 
                // 进入第3行了
                if(j==0||j==i){
                    // 当 j=0 或者 j=i 时，为当前行首列和最后一列，值为 1
                    yanghui[i][j] = 1;
                }else{
                // 规律：
                // 从第3行开始第2列开始，当前列的值为 上一行当前列 + 上一行前一列
                    yanghui[i][j] = yanghui[i-1][j] + yanghui[i-1][j-1];
         
               }
                System.out.print(yanghui[i][j] + "\t");


               // }
            }

            System.out.println();
        }

        System.out.println("\n============杨辉三角============================");

        for(int i=0;i<yanghui.length;i++){
            for(int j=0;j<yanghui[i].length;j++){
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }


    }
}