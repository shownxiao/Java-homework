package Unite10;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

/* 编程练习1 */
public class Java_1 extends Applet {
    int choice;
    public void init(){
        String input;
        input = JOptionPane.showInputDialog(
                "输出1去画直线\n" +
                "输出2去画矩形\n" +
                "输出3去画椭圆\n"
        );
        choice = Integer.parseInt(input);
    }
    public void paint(Graphics g){
        for(int i = 0; i < 10; i++){
            switch (choice){
                case 1:
                    g.drawLine(10, 10, 250, 10 + i * 10);
                    break;
                case 2:
                    g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i* 10);
                    break;
                case 3:
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "输入非法值");
            }
        }
    }
}
