import java.util.Scanner;
/**
 * ������ҵ���ܣ�
 */
public class Homework01{
    public static void main(String[] args){
        /**
         * 1.��֪����һ����������飬Ҫ�����һ��Ԫ�أ���������Ȼ������
         * [10,12,45,90],����23�� [10,12,23,45,90]
         */
        Scanner myScanner = new Scanner(System.in);

        int[] arr1 = {10,12,45,90};
        System.out.println("=======================ԭ����===========================");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println();
       
       // һֱѯ���û��Ƿ�������룬ֱ���û���������
       char input;
       while(true){
         System.out.println("������Ҫ���뵽��������֣�");
        // ������ʱ���飬������ԭ���鳤�� +1 �����û����������
        int[] tempArr = new int[arr1.length + 1];
        tempArr[arr1.length] = myScanner.nextInt();

        // ����ԭ���鵽��ʱ����
        for(int i=0;i<arr1.length;i++){
            tempArr[i] = arr1[i];
        }
        // ԭ����ָ����ʱ����
        arr1 = tempArr;

        System.out.println("�Ƿ�������룿y/n��");
        input = myScanner.next().charAt(0);
        if(input == 'n' || input == 'N'){
            break;
        }
       }

        // ��ð����������
        for(int i=0;i<arr1.length - 1;i++){
            for(int j=0;j<arr1.length -1 - i;j++){
                if(arr1[j]>arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }

        // ��ӡ������
        System.out.println("=======================������===========================");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}