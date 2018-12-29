package Unite10;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

/* 编程练习2 */
public class Java_2 extends Applet {
    int x, y;
    public void init(){
        String input;
        input = JOptionPane.showInputDialog("请输入x的值");
        this.x = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("请输入y的值");
        this.y = Integer.parseInt(input);
    }
    public void paint(Graphics g){
        g.drawLine(x, y + 50, x + 50, y);
        g.drawLine(x + 50, y, x + 100, y + 50);
        g.drawLine(x + 100, y + 50, x, y + 50);
        g.drawLine(x + 10, y + 50, x + 10, y + 150);
        g.drawLine(x + 10, y + 150, x + 90, y + 150);
        g.drawLine(x + 90, y + 150, x + 90, y + 50);
        g.drawLine(x + 40, y + 150, x + 40, y + 120);
        g.drawLine(x + 40, y + 120, x + 60, y + 120);
        g.drawLine(x + 60, y + 120, x + 60, y + 150);
        g.drawOval(x + 40, y + 60, 20, 20);
    }
}
