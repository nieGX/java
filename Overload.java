// 方法重载
public class Overload{
    public static void main(String[] args){
        O o = new O();
    }
}

class O{
    // 重载
    // 方法名相同
    // 形参列表顺序或类型或个数，满足至少一项不同
    public void greater(int a,int b){

    }
    public void greater(double a,int b){}
    public double greater(double a,int b,int c){
        return 0.01;
    }
}