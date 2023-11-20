/**
 * 本章作业汇总：
 */
public class Homework02{
      public static void main(String[] args){
        /**
         * 2.随机生成 10个 整数 （ 0-100 ）保存到数组，并倒序打印以及求平均值、求最大值最小值的下标，并查找里面是否有8
         * 
         */
        int[] arr = new int[10];
        int sum = 0;
        double avg;
        int maxNum = 0;
        int minNum = 100;
        int maxIndex = 0;
        int minIndex = 0;
        int count = 0;

        // 随机生成
        for(int i=0;i<arr.length;i++){
            //  生成 1 - 100 之间任意一个数字
            arr[i] = (int)(Math.random() * 100 + 1);
            // 记录最大值
            if(maxNum<arr[i]){
                maxNum = arr[i];
                maxIndex = i;
            }
            // 记录最小值
            if(minNum>arr[i]){
                minNum = arr[i];
                minIndex = i;
            }
            // 算总和
            sum += arr[i];
            // 是否出现 8 
            if(arr[i]==8){
                count++;
            }

        }
        // 打印随机生成的数组
        System.out.println("=======================随机生成的数组================================");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("=======================最大值下标================================");
        System.out.println(maxIndex);
        System.out.println("=======================最小值下标================================");
        System.out.println(minIndex);
        System.out.println("=======================平均值================================");
        avg = (double)sum / arr.length;
        System.out.println(avg);
          System.out.println("=======================8出现的次数================================");
        System.out.println(count);

        // 倒序排序
        for(int i=0;i<arr.length -1;i++){
            for(int j=0;j<arr.length - 1 - i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

 System.out.println("=======================倒序排序的数组================================");
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] +" ");
        }
    
        
      }
}