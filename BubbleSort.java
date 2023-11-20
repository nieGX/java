/**
 * 实现冒泡排序（从小到大排序），从大到小只需要把比较符号改＜就行了
 * 1.每一轮确定一个最大数，并把最大数放到数组最后
 * 2.每一轮比较的次数是逐渐减少了
 */

public class BubbleSort{
    public static void main (String[] args){
        int[] myArray = {100,1,5,6,2,10,33,24};
        System.out.println("===================== 排序前 ==========================");
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i]+"\t");
        }
        // 1.遍历数组，只需要比较数组长度 - 1 次就够了
        for(int i=0;i<myArray.length - 1;i++){
            // 2.比较元素，因为每轮都确定了一个最大数，所以比较次数逐轮递减 myArray.length - 1 - i
            for(int j=0;j<myArray.length - 1 - i;j++){
                if(myArray[j]>myArray[j+1]){
                    // 当前元素比下一个元素大，交换位置
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }

         System.out.println("\n===================== 排序后 ==========================");
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i]+"\t");
        }
    }
}

// 可优化点：如果数组本来就是有序的，那么就不需要再继续遍历了。
// 可以定义一个count变量保存交换位置的次数，如果第一轮遍历后没有交换任何元素位置，说明数组是有序的，不需要继续遍历了