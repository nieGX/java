/**
 * ʵ��ð�����򣨴�С�������򣩣��Ӵ�Сֻ��Ҫ�ѱȽϷ��Ÿģ�������
 * 1.ÿһ��ȷ��һ�������������������ŵ��������
 * 2.ÿһ�ֱȽϵĴ������𽥼�����
 */

public class BubbleSort{
    public static void main (String[] args){
        int[] myArray = {100,1,5,6,2,10,33,24};
        System.out.println("===================== ����ǰ ==========================");
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i]+"\t");
        }
        // 1.�������飬ֻ��Ҫ�Ƚ����鳤�� - 1 �ξ͹���
        for(int i=0;i<myArray.length - 1;i++){
            // 2.�Ƚ�Ԫ�أ���Ϊÿ�ֶ�ȷ����һ������������ԱȽϴ������ֵݼ� myArray.length - 1 - i
            for(int j=0;j<myArray.length - 1 - i;j++){
                if(myArray[j]>myArray[j+1]){
                    // ��ǰԪ�ر���һ��Ԫ�ش󣬽���λ��
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }

         System.out.println("\n===================== ����� ==========================");
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i]+"\t");
        }
    }
}

// ���Ż��㣺������鱾����������ģ���ô�Ͳ���Ҫ�ټ��������ˡ�
// ���Զ���һ��count�������潻��λ�õĴ����������һ�ֱ�����û�н����κ�Ԫ��λ�ã�˵������������ģ�����Ҫ����������