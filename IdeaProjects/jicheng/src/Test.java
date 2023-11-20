import com.myself.jicheng.NotePad;
import com.myself.jicheng.PC;

public class Test {
    public static void main(String[] args) {
        PC pc = new PC("英特尔I10-5900H",16,512,"联想拯救者");
        System.out.println("PC类信息：");
        pc.getDetails();
        System.out.println("品牌："+pc.brand);
        NotePad notePad = new NotePad("锐龙6代-6900",32,512,"冰魄白");
        System.out.println("NotePad类信息：");
        notePad.getDetails();
        System.out.println("颜色："+notePad.color);

    }
}
