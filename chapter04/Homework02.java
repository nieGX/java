/**
 * 02��ҵ����
 */
public class Homework02{
    public static void main(String[] args){
        /**
         * 1.��� 1-100 ֮��Ĳ��ܱ�5����������ÿ5��һ��
         */
        // �ж��Ƿ���5��������
        int count = 0;
        for(int i=1;i<=100;i++){
            // ���Ȳ�����5�ı���
            if(i%5>0){
                System.out.print(i +" ");
                count++;

                if(count%5==0){
                    System.out.println("");
                }
            }


        }

        System.out.println("\n=================================================");

        /**
         * 2.���Сд�� a-z���Լ���д�� Z-A (a:97 -> A:65) ���32
         */
        char a = 'a';
        char z = 'z';
        for(int i = 0;i<26;i++){  
            // 1.��� a-z�� 97 + i
            // 2.��� Z-A�� 97 + i - 32 + 25-i*2
            System.out.println((char)(a+i)+"\t"+(char)(a+i-32  + 25 - i * 2));
        }


         System.out.println("=================================================");

        /**
         * 3.��� 1 - 1/2 + 1/3 - 1/4 + 1/5 ...... 1/100�ĺ�
         */
        // ����ע�⵽ 1/�κ��������������1������
        // ���Ա���� 1 תΪ 1.0
        double sum = 0;
        for(int i=1;i<=100;i++){
            // ż���ü����������üӷ�
            if(i%2==0){
                sum -= 1.0 / i;
            }else{
                sum+= 1.0 / i;
            }
        }

        System.out.println("1 - 1/2 + 1/3 - 1/4 + 1/5 ...... 1/100�ĺ�");
        System.out.println("sum = "+sum);


        System.out.println("=================================================");

        /**
         * 4.�� 1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+4+...+100)�Ľ��
         */
        int sumNum = 0;
        for(int i=1;i<=100;i++){
            // ����ʾ�ڼ���
            for(int j=1;j<=i;j++){
                // �ڲ�ѭ����ʾÿһ�ֵ��ܺ�
                sumNum += j;
            }
        }

        System.out.println("1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+4+...+100)�Ľ��");
        System.out.println("sumNum = "+sumNum);
    }
}