/**
 * ���ӳ���������
 * ��һ�ѵ����ӣ�����ÿ��������е�һ�벢���1��������10��ʱ����û�Ծͷ���ֻ��1��������
 * ��������ж��ٸ�����
 *
 * �õݹ�����
 * 1.��10�죺ʣ�� 1
 * 2.��9�죺 ʣ�� (1 + 1) * 2 = 4
 * 3.��8�죺 ʣ�� ��4 + 1�� * 2 = 10
 * 4.������ǰ�ƣ���һ�ֵĽ�� + 1 �� �� ��2 �ó����ֽ��
 * 5.���ս����
 *
 */

public class MonkeyPeach{
    public static void main(String[] args){
        P p1 = new P();
       int sum =  p1.peachNum(10,1);
        System.out.println("������� "+sum+" ������");
    }
}

class P{
    public int peachNum(int day,int sum){
        if(day>1){
            return peachNum(day-1,(sum+1)*2);
        }

        return sum;
    }
}