import java.util.Scanner;
public class ArrayReduce{
    public static void main (String[] args){

        /**
         * ��һ������ {1,2,3,4,5}�����Խ�����������
         * ��ʾ�û��Ƿ����������y���� n����
         * ÿ���������һ��Ԫ�أ�
         * ��ֻʣ��һ��Ԫ����ʾ�û�����������
         */
        // 1.ԭ����
        int[] myArray = {1,2,3,4,5};

                Scanner myScanner = new Scanner(System.in);
                char input;
        do{
             // 2.������
        int[] newArray = new int[myArray.length - 1];
        // 3.��������
        for(int i=0;i<newArray.length;i++){
            newArray[i] = myArray[i];
        }
        // 4.�޸�ָ��
        myArray = newArray;
                System.out.println("============ myArray ������=================");
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i]+"\t");
        }

        // �ж����鳤���Ƿ�Ϊ1
        if(myArray.length == 1){
            System.out.println("����myArrayֻʣ�����һ��Ԫ�أ�������������");
            break;

        }else{
            // 5.��ʾ�Ƿ����
        System.out.print("�Ƿ����ɾ�����飿y/n��");
        input = myScanner.next().charAt(0);

        // �ж��Ƿ����
        if(input == 'n' || input == 'N'){
            break;
        }
        }

        }while(true);

        System.out.println("����������...");
       


    }
}