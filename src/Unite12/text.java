package Unite12;
/* 基础训练1 */
public class text extends Thread{
    int sleep_time;
    public text(String name, int t){
        super(name);
        sleep_time = t;
    }
    public void run(){
        for(int k = 1; k <= 10; k++){
            System.out.println(getName()+":"+k);
        }
        try {
            sleep(sleep_time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        Thread x1 = new text("first", 5000);
        x1.setPriority(6);
        x1.start();
        new text("second", 200).start();
    }
}
