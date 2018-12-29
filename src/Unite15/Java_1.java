package Unite15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


/* 编程练习1 */
public class Java_1 {
    public static void main(String args[]){
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(1000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event){
        Date now = new Date();
        System.out.println("At the tone, the time is" + now);
        Toolkit.getDefaultToolkit().beep();
    }
}
