/** 
 * �žų˷���
 */
public class NineNine{
    public static void main(String[] args){
        // 1.һ����9��
        // 2.ÿ����������Ǳ��ֵĴ���
        for(int i=1;i<=9;i++){
            // ���ѭ����
            for(int j=1;j<=i;j++){
                // �ڲ�ѭ����
                System.out.print(j + " * " + i + " = "+ i * j);
                // �Ʊ���ָ���
                System.out.print("\t");
            }
            // ��һ�п�ʼ
            System.out.println("");
            
        }
    }
}