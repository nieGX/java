/**
 * 石头剪刀布游戏
 * 0-石头 1-剪刀 2-布
 * 用户输入0或1或2，电脑随机输出012，记录用户输赢的结果
 * 
 */
import java.util.Scanner;
public class Game{
    public static void main(String[] args){
         Scanner nameScanner = new Scanner(System.in);

         System.out.println("==========欢迎来到石头剪刀布小游戏！(0-石头，1-剪刀，2-布)==========");

         System.out.print("请输入您的昵称：");
         String playerName = nameScanner.next();
         System.out.println();

         System.out.print("是否开始游戏？y/n：");
         char go = nameScanner.next().charAt(0);
         System.out.println();

         if(go=='y'||go=='Y'){
            MyGame game = new MyGame(playerName);
            game.start();
         }

         System.out.println("游戏退出...");


    }
}

// 石头剪刀布
class MyGame{
    String[] gameEnum = {"石头","剪刀","布"};//枚举
    int win=0;//赢次数
    int lose=0;//输次数
    int same=0;//平局次数
    int count=0;//总局数
    String playerName;//玩家名称

    // 构造器，初始化玩家姓名
    public MyGame(String name){
        this.playerName = name;
    }

    // 启动游戏
    public void start(){
        while(true){
            this.count++;
            System.out.println("*******************第"+this.count+"局*******************");
            System.out.print("玩家【"+this.playerName+"】！请出拳：");
    
            // 电脑随机出0,1,2
            int computer = (int)(Math.random() * 3);
            // 玩家输入
            Scanner myScanner = new Scanner(System.in);
            int player = myScanner.nextInt();
            // 记录结果
            int result = this.winner(player,computer);
            // 输出猜拳结果
            // System.out.println("第"+this.count+"局：");
            System.out.println("computer：【"+this.gameEnum[computer]+"】");
            System.out.println(this.playerName+"：【"+this.gameEnum[player]+"】");
    
            if(result==1){
                this.win++;
                System.out.println("WINNER！恭喜你！本局获胜！");
            }else if(result==-1){
                this.lose++;
                 System.out.println("LOSE!再接再励！");
            }else{
                this.same++;
                System.out.println("HAPPY！本轮平局！");
            }

            System.out.println();
            System.out.print("是否继续游戏y/n：");
            char keep = myScanner.next().charAt(0);
            System.out.println();
            
            // 不再继续游戏
            if(keep!='Y'&&keep!='y'){
                break;
            }
        }

        // 输出清单
        System.out.println("总局数："+this.count+"；"+"赢："+this.win+"；"+"输："+this.lose+"；"+"平局："+this.same);


    }


    // 判断玩家的输赢 (1-赢，-1-输，0-平局)
    public int winner(int player,int computer){
        // 是否平局
        if(player == computer){
            return 0;
        }

        // 判断输赢
        if(player==0){
            return computer==1 ? 1 : -1;
        }else if(player==1){
            return computer==2 ? 1 : -1;
        }else{
            return computer==0 ? 1 : -1;
        }
    }
}