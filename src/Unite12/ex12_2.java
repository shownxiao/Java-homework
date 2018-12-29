package Unite12;

import java.applet.Applet;
import java.awt.*;

/* 基础训练2 */
public class ex12_2 extends Applet implements Runnable {
    public void init(){
        Thread x = new Thread(this);
        x.start();
    }
    public void run(){
        for(;;){
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void paint(Graphics g){
        int x = 10 + (int)(Math.random()*100);
        int y = 10 + (int)(Math.random()*100);
        g.drawRect(x, y, 100, 100);
    }
}
