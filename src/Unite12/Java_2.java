package Unite12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

/* 编程练习2 */
public class Java_2 extends Applet implements Runnable {
    Image picture;
    boolean flag = true;
    public void init(){
        Thread t = new Thread(this);
        Button b1 = new Button("begin");
        b1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        flag = false;
                        init();
                        run();
                    }
                }
        );
        add(b1);
        Button b2 = new Button("pause");
        b2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        flag = true;
                        init();
                        run();
                    }
                }
        );
        add(b2);
        t.start();
    }
    public void run(){
        while (flag){
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void paint(Graphics g){
        URL picture_url = null;
        try {
            picture_url = new URL("file:/C:/Users/肖婴然/Desktop/图片/M0." + (int)(Math.random()*30) + ".jpg");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        System.out.println(picture_url);
        picture = getImage(picture_url);
        g.drawImage(picture, 10, 10, this);
    }
}
