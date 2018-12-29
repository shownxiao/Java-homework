package Unite1;
/*第一章基础训练三*/
import java.awt.*;
import java.applet.Applet;

public class triangle extends Applet {
    public void paint(Graphics g){
            g.setColor(Color.red);
            g.drawLine(80, 20, 20, 100);
            g.drawLine(20, 100, 140, 100);
            g.drawLine(140, 100, 80, 20);
            g.setColor(Color.blue);
            g.drawString("三角形", 65, 80);
    }
}
