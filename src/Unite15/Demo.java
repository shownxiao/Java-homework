package Unite15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* 基础训练1 */
public class Demo extends JFrame implements ActionListener {
    JButton btn;
    public Demo(){
        Container cont = getContentPane();
        btn = new JButton("变色");
        cont.add(btn);
        setSize(200, 200);
        setVisible(true);
        btn.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        Color a[] = {Color.red, Color.blue, Color.green, Color.orange};
        btn.setBackground(a[(int)(Math.random()*4)]);
    }
    public static void main(String args[]){
        new Demo();
    }
}
