/**
 * ��ҵ1���������б��ʽ�Ľ����
 * (1) 10 / 3 =?
 * (2) 10 / 5= ?
 * (3) 10 % 2 = ?
 * (4) -10.5 % 3 = ?
 */
public class Homework01{
    public static void main(String[] args){
        // 10��3����int���ͣ����Խ��Ҳ��int����
        System.out.println("10 / 3 = " + 10 / 3);// 3
        System.out.println("10 / 5 = " + 10 / 5);// 2
        // 10��2����int���ͣ����Խ��Ҳ��int���� 
        System.out.println("10 % 2 = " + 10 % 2);// 0
        // a % b
        // ��a�Ǹ���ʱ����ס��ʽ�� ��� = a - (int)a / b * b
        //  -10.5 - (int)-10/3*3 -> -10.5 + 9
        System.out.println("-10.5 % 3 = " + -10.5 % 3);// -1.5

    }
}