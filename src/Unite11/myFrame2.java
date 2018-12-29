package Unite11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* 综合样例 */
public class myFrame2 extends Frame implements ActionListener {
    Label res;
    TextField f1, f2;
    public myFrame2(){
        f1 = new TextField(20);
        f2 = new TextField(20);
        Button b1 = new Button("+");
        Button b2 = new Button("*");
        res = new Label(" 运算结果 ");
        setLayout(new GridLayout(3, 2));
        add(f1);
        add(f2);
        add(b1);
        add(b2);
        add(res);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int x1 = Integer.parseInt(f1.getText());
        int x2 = Integer.parseInt(f2.getText());
        if(e.getActionCommand().equals("+")){
            res.setText(""+(x1 + x2));
        }
        else {
            res.setText(""+(x1 * x2));
        }
    }
    public static void main(String args[]){
        Frame my = new myFrame2();
        my.setSize(200, 200);
        my.setVisible(true);
    }
}
