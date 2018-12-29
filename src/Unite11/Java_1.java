package Unite11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/* 编程练习1 */
public class Java_1 extends Frame {
    public Java_1(){
        super("打印无符号整数位");
        setLayout(new FlowLayout());
        final TextField output = new TextField(33);
        TextField input = new TextField(10);
        input.addActionListener(
                new ActionListener() {
                        public void actionPerformed(ActionEvent e){
                            int val = Integer.parseInt(e.getActionCommand());
                            output.setText(getBits(val));
                    }
                }
        );
        add(input);
        add(new JLabel("该数的二进制位表示是"));
        output.setEditable(false);
        add(output);
        setSize(720, 70);
        show();
    }
    private String getBits(int value){
        int displayMask = 1 << 31;
        StringBuffer buf = new StringBuffer(35);
        for(int c = 1; c <= 32; c ++){
            buf.append((value & displayMask) == 0 ? '0' : '1');
            value <<= 1;
            if(c % 8 == 0){
                buf.append(' ');
            }
        }
        return buf.toString();
    }
    public static void main(String args[]){
        Java_1 app = new Java_1();
        app.addWindowFocusListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e){
                        System.exit(0);
                    }
                }
        );
    }
}
