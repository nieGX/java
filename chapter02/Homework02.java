/**
 *
 * ��ҵ2��
 * (1)����������������+��ƴ�ӣ���Ч����
 * (2)���������Ա���+��ƴ�ӣ���Ч����
 * (3)����������۸���+��ƴ�ӣ���Ч����
 */
public class Homework02{
    public static void main(String[] args){
        // (1)
        String book1 = "���μ�";
        String book2 = "��������";

        System.out.println(book1+book2);// + �ű�ʾ�ַ���ƴ�� "���μ���������"

        // (2)
        char gender1='��';
        char gender2='Ů';
        System.out.println(gender1+gender2); // ����char��������ʱ���Զ�����Ϊint���ͣ����Խ�����ַ��к��ַ�Ů��Ӧ��unicode������ӵĺͣ�30007(��)+22899(Ů)=52906

        // (3)
        int price1 = 99;
        int price2 = 199;
        System.out.println(price1+price2);// ������� 99+199=298
    }
}