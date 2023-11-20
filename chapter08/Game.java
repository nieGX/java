/**
 * ʯͷ��������Ϸ
 * 0-ʯͷ 1-���� 2-��
 * �û�����0��1��2������������012����¼�û���Ӯ�Ľ��
 * 
 */
import java.util.Scanner;
public class Game{
    public static void main(String[] args){
         Scanner nameScanner = new Scanner(System.in);

         System.out.println("==========��ӭ����ʯͷ������С��Ϸ��(0-ʯͷ��1-������2-��)==========");

         System.out.print("�����������ǳƣ�");
         String playerName = nameScanner.next();
         System.out.println();

         System.out.print("�Ƿ�ʼ��Ϸ��y/n��");
         char go = nameScanner.next().charAt(0);
         System.out.println();

         if(go=='y'||go=='Y'){
            MyGame game = new MyGame(playerName);
            game.start();
         }

         System.out.println("��Ϸ�˳�...");


    }
}

// ʯͷ������
class MyGame{
    String[] gameEnum = {"ʯͷ","����","��"};//ö��
    int win=0;//Ӯ����
    int lose=0;//�����
    int same=0;//ƽ�ִ���
    int count=0;//�ܾ���
    String playerName;//�������

    // ����������ʼ���������
    public MyGame(String name){
        this.playerName = name;
    }

    // ������Ϸ
    public void start(){
        while(true){
            this.count++;
            System.out.println("*******************��"+this.count+"��*******************");
            System.out.print("��ҡ�"+this.playerName+"�������ȭ��");
    
            // ���������0,1,2
            int computer = (int)(Math.random() * 3);
            // �������
            Scanner myScanner = new Scanner(System.in);
            int player = myScanner.nextInt();
            // ��¼���
            int result = this.winner(player,computer);
            // �����ȭ���
            // System.out.println("��"+this.count+"�֣�");
            System.out.println("computer����"+this.gameEnum[computer]+"��");
            System.out.println(this.playerName+"����"+this.gameEnum[player]+"��");
    
            if(result==1){
                this.win++;
                System.out.println("WINNER����ϲ�㣡���ֻ�ʤ��");
            }else if(result==-1){
                this.lose++;
                 System.out.println("LOSE!�ٽ�������");
            }else{
                this.same++;
                System.out.println("HAPPY������ƽ�֣�");
            }

            System.out.println();
            System.out.print("�Ƿ������Ϸy/n��");
            char keep = myScanner.next().charAt(0);
            System.out.println();
            
            // ���ټ�����Ϸ
            if(keep!='Y'&&keep!='y'){
                break;
            }
        }

        // ����嵥
        System.out.println("�ܾ�����"+this.count+"��"+"Ӯ��"+this.win+"��"+"�䣺"+this.lose+"��"+"ƽ�֣�"+this.same);


    }


    // �ж���ҵ���Ӯ (1-Ӯ��-1-�䣬0-ƽ��)
    public int winner(int player,int computer){
        // �Ƿ�ƽ��
        if(player == computer){
            return 0;
        }

        // �ж���Ӯ
        if(player==0){
            return computer==1 ? 1 : -1;
        }else if(player==1){
            return computer==2 ? 1 : -1;
        }else{
            return computer==0 ? 1 : -1;
        }
    }
}