import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        // 1.����Scanner�࣬������Scanner����
        Scanner myScanner = new Scanner(System.in);
        System.out.println("������������");
        // 2.ʹ��Scanner����ط�����ȡ��������
        String name = myScanner.next();
        System.out.println("���������䣺");
        int age = myScanner.nextInt();
        System.out.println("������ɼ���");
        double score = myScanner.nextDouble();

        System.out.println("����\t����\t�ɼ�\n"+name+"\t"+age+"\t"+score);
    }
}