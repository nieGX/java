/**
 * ��ӡ�������
 * 1
 * 1 1
 * 1 2  1
 * 1 3  3 1
 * 1 4  6 4  1
 * 1 5 10 10 5 1
 *
 * ע��۲���ɣ�
 * (1)ÿһ�еĵ�һ�������һ��Ԫ�ض��� 1
 * (2)�ӵ�3�п�ʼ��2�п�ʼ����ǰ�е�ֵΪ ��һ�е�ǰ�� + ��һ��ǰһ��
 * 
 */
public class YangHui{
    public static void main (String[] args){
        // ��ӡ10�е��������
        int len = 10;
        // ����һ�� 10 �еģ�����ȷ�������Ķ�ά����
        int [][] yanghui = new int [len][];

        // ��ʼ��ӡ
        for(int i=0;i<yanghui.length;i++){
             // ����ά�����е�ÿ��Ԫ������һ���ռ�,����Ϊ i + 1
                yanghui[i] = new int[i+1];
            for(int j=0;j<=i;j++){
                // �ӵ�3�п�ʼ���й��ɣ�ǰ���ж��� 1
               // if(i<2){
               //  yanghui[i][j] = 1;
               //  System.out.print(yanghui[i][j] + "\t");
               // }else{
               // ��������Ҫ�ж� i < 2 ��Ϊ j==0 �� j== i �Ѿ������� i < 2 �����
               // 
                // �����3����
                if(j==0||j==i){
                    // �� j=0 ���� j=i ʱ��Ϊ��ǰ�����к����һ�У�ֵΪ 1
                    yanghui[i][j] = 1;
                }else{
                // ���ɣ�
                // �ӵ�3�п�ʼ��2�п�ʼ����ǰ�е�ֵΪ ��һ�е�ǰ�� + ��һ��ǰһ��
                    yanghui[i][j] = yanghui[i-1][j] + yanghui[i-1][j-1];
         
               }
                System.out.print(yanghui[i][j] + "\t");


               // }
            }

            System.out.println();
        }

        System.out.println("\n============�������============================");

        for(int i=0;i<yanghui.length;i++){
            for(int j=0;j<yanghui[i].length;j++){
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }


    }
}