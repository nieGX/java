public class utils {
    //    使用main模板快速生成代码
    public static void main(String[] args) {
        MyTools tools = new MyTools();
        int[] myArr1 = {0,-2,2,3,1,8,7,10};
        System.out.println("1.排序前的数组");
        tools.printArray(myArr1);
        tools.BubbleSort(myArr1);
        System.out.println("1.排序后的数组");
        tools.printArray(myArr1);

        int[] myArr2 = {0,2,2,3,4,8,9,10};
        System.out.println("2.排序前的数组");
        tools.printArray(myArr2);
        tools.BubbleSort(myArr2);
        System.out.println("2.排序后的数组");
        tools.printArray(myArr2);
    }
}

// 创建自己的工具类
class MyTools {
    //   1.冒泡排序方法
    public void BubbleSort(int[] arr) {
//        用一个变量判断数组本身是否有序
        boolean sorted = true;

//        排序核心代码
        for (int i = 0; i < arr.length - 1; i++) {
//            外层循环第几轮
            for (int j = 0; j < arr.length - 1 - i; j++) {
//                内层循环本轮比较次数
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;
                }
            }

//            如果第一轮比较中，没有替换元素，说明数组本身有序，可以跳出循环
            if (sorted) {
                break;
            }
        }
    }

    //    打印数组方法
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
