/**
 * ��ӡ������ Pyramid
 */
public class Pyramid{
    public static void main(String[] args){

        // ���������
        // ����
        int rowNum = 5;
        for(int i=0;i<rowNum;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        // ��������
        int rowNum2=5;
        for(int i=1;i<=rowNum2;i++){
            // ��ӡ�ո��������������-��ǰ����
            for(int k=1;k<=rowNum2-i;k++){
                System.out.print(" ");
            }
            // �ڲ�ѭ����ֹ������ֵ�ǣ���ǰ����+��һ������
            for(int j=1;j<=i+(i-1);j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        // ����
        int rowNum3 = 9;
        // �ֽ���
        int middleNum = (rowNum3 / 2) + 1;
        for(int i=1;i<=rowNum3;i++){
            // ��ӡ�ո�������(�ֽ�����ֵ - ��ǰ����)�ľ���ֵ
            for(int k=1;k<=Math.abs(middleNum-i);k++){
                System.out.print(" ");
            }
            if(i<=middleNum){
                // �ڲ�ѭ����ֹ������ֵ�ǣ���ǰ����+��һ������
            for(int j=1;j<=i+(i-1);j++){
                System.out.print("*");
            }
        }else{
            // �ڲ�ѭ����ֹ������ֵ�ǣ���ǰ����+��һ������
            for(int j=1;j<=middleNum+(middleNum - i)+(middleNum+(middleNum - i)-1);j++){
                System.out.print("*");
            }}
             System.out.println("");
            
        }
       
        
    }
}