import java.util.Scanner;
/**
 * ������ҵ��ϰ�����
 */
public class Homework{
    public static void main(String[] args){
        /**
         * 1.ĳ����100000(10��)Ԫ��ÿ����һ��·�ڣ���Ҫ���ѣ���������
         * (1)���ֽ�>50000(5��)ʱ��ÿ�ν�5%
         * (2)���ֽ�<=50000(5��)ʱ��ÿ�ν�1000
         * Ҫ��ʹ�� while break ��ʽ��������˿��Ծ������ٴ�·��
         */
        // ��ǰ�ֽ���
        double cash = 100000;
        // ͳ�ƾ���·������
        int count = 0;

        while(true){
            if(cash>50000){
                // �ֽ�5�򣬽�5%
                cash -= cash * 0.05;
            }else{
                cash -= 1000;
            }
            // ����·�ڴ���+1
             count++;
            if(cash<1000){
                // �ֽ�����1000���˳�ѭ��
                break;
            }
        }

        System.out.println("���˿��Ծ��� "+count+" ��·��\n��ʣ�� "+cash+" Ԫ");

        System.out.println("============================================================================");
        /**
         * 2.ʵ���ж�һ�������������ĸ���Χ����0����0��=0
         */
        Scanner myScanner = new Scanner(System.in);
        int num;
        System.out.println("������һ��������");
        num = myScanner.nextInt();
        // System.out.println("num="+num);
        if(num>0){
            System.out.println(num+"��0");
        }else if(num<0){
             System.out.println(num+"��0");
        }else{
             System.out.println(num+"=0");
        }

         System.out.println("============================================================================");
        /**
         * 3.�ж�һ������Ƿ�Ϊ����
         * (1)�����4�ı������Ҳ���100�ı����ģ�Ϊ����
         * (2)�����400�ı���������
         */
        
        int year;
        System.out.println("��������ݣ�");
        year = myScanner.nextInt();
        if((year % 4 == 0 && year % 100 > 0 )||year % 400 == 0 ){
            System.out.println(year+"�������꣡");
        }else{
            System.out.println(year+"�겻�����ꡣ");
        }


         System.out.println("============================================================================");
        /**
         *4.�ж�һ�������Ƿ�Ϊˮ�ɻ���
         * ˮ�ɻ�����һ��3λ����ÿһλ�ĸ����������͵������ֱ���
         */
        
        int flowerNum;
        int baiNum;// �ٷ�λ����
        int shiNum;// ʮ��λ����
        int geNum;// ����λ����
        do{
            System.out.println("������һ�� 100 - 999 ֮���������");
            flowerNum = myScanner.nextInt();
          }while(flowerNum<=0||flowerNum>=1000);//�����������ֲ���100 - 999�ķ�Χ����������ѭ��Ҫ��������ȷ����

          // ��ȡ�ٷ�λ����
        baiNum = flowerNum / 100;
         // ��ȡʮ��λ����
        shiNum = (flowerNum % 100) / 10;
         // ��ȡ����λ����
        geNum = (flowerNum % 100) % 10;

        // ����������
        int sum = (int)(Math.pow(baiNum,3) + Math.pow(shiNum,3) + Math.pow(geNum,3));

        if(sum==flowerNum){
            System.out.println("��ϲ�� "+flowerNum+" ��ˮ�ɻ�����");
        }else{
            System.out.println(flowerNum+" ����ˮ�ɻ�����");
        }

    }
}