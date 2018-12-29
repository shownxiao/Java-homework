package Unite1;
import java.awt.*;
import java.applet.Applet;

/*第一章编程练习第二题*/
public class Java_2 extends Applet {
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawLine(10, 10, 110, 10);
        g.drawLine(110, 10, 110, 110);
        g.drawLine(110, 110, 10, 110);
        g.drawLine(10, 110, 10, 10);
        g.setColor(Color.red);
        g.drawOval(10, 10, 100, 100);
    }
}
