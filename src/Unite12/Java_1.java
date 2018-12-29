package Unite12;
/* 编程练习1 */
public class Java_1 {
    public static void main(String args[]){
        Hello h = new Hello();
        Thread t = new Thread(h);
        t.start();
    }
}
class Hello implements Runnable{
    int i = 0;
    public void run(){
        while (true){
            System.out.println("Hello!");
            if(i++ == 5){
                break;
            }
        }
    }
}
