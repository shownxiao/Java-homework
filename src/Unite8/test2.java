package Unite8;
/* 基础训练2 */
interface Listener{
    void action();
}
class test3 implements Listener{
    public void action(){System.out.println("sit down");}
}

public class test2 implements Listener {
    public void action(){System.out.println("stand up");}
    public void add(Listener a){
        a.action();
    }
    public static void main(String a[]){
        Listener x[]={new test2(),new test3()};
        x[0].action();
        x[1].action();
        test2 y=new test2();
        y.add(y);
        y.add(new test3());
    }
}

