// ��������
public class Overload{
    public static void main(String[] args){
        O o = new O();
    }
}

class O{
    // ����
    // ��������ͬ
    // �β��б�˳������ͻ��������������һ�ͬ
    public void greater(int a,int b){

    }
    public void greater(double a,int b){}
    public double greater(double a,int b,int c){
        return 0.01;
    }
}