/**
 * ������ҵ���ܣ�
 */
public class Homework02{
      public static void main(String[] args){
        /**
         * 2.������� 10�� ���� �� 0-100 �����浽���飬�������ӡ�Լ���ƽ��ֵ�������ֵ��Сֵ���±꣬�����������Ƿ���8
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

        // �������
        for(int i=0;i<arr.length;i++){
            //  ���� 1 - 100 ֮������һ������
            arr[i] = (int)(Math.random() * 100 + 1);
            // ��¼���ֵ
            if(maxNum<arr[i]){
                maxNum = arr[i];
                maxIndex = i;
            }
            // ��¼��Сֵ
            if(minNum>arr[i]){
                minNum = arr[i];
                minIndex = i;
            }
            // ���ܺ�
            sum += arr[i];
            // �Ƿ���� 8 
            if(arr[i]==8){
                count++;
            }

        }
        // ��ӡ������ɵ�����
        System.out.println("=======================������ɵ�����================================");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("=======================���ֵ�±�================================");
        System.out.println(maxIndex);
        System.out.println("=======================��Сֵ�±�================================");
        System.out.println(minIndex);
        System.out.println("=======================ƽ��ֵ================================");
        avg = (double)sum / arr.length;
        System.out.println(avg);
          System.out.println("=======================8���ֵĴ���================================");
        System.out.println(count);

        // ��������
        for(int i=0;i<arr.length -1;i++){
            for(int j=0;j<arr.length - 1 - i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

 System.out.println("=======================�������������================================");
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] +" ");
        }
    
        
      }
}