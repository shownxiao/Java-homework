package Unite15;
/* 编程练习2 */
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Vector;

/* 编程练习3 */
public class Java_2 extends JFrame {
    public static void main(String args[]){
        Java_2 example = new Java_2();
        example.setVisible(true);
    }
    public Java_2(){
        super();
        setTitle("选择图片");
        setBounds(100, 100, 500, 375);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JSplitPane hSplitPane = new JSplitPane();
        hSplitPane.setDividerLocation(125);
        getContentPane().add(hSplitPane, BorderLayout.CENTER);
        Vector contents = new Vector();
        JList<String> list = new JList<String>(contents);
        contents.add("MA.1.jpg");
        contents.add("MA.2.jpg");
        contents.add("MA.3.jpg");
        contents.add("MA.4.jpg");
        contents.add("MA.5.jpg");
        contents.add("MA.6.jpg");
        JLabel j1 = new JLabel();
        int number = 1;
        list.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent evt){
                if(evt.getValueIsAdjusting())
                    return ;
                System.out.println("选自" + evt.getLastIndex());
                int number = evt.getLastIndex() + 1;
                String img_url = "C:/Users/肖婴然/Desktop/图片/MA0."+number+".jpg";
                System.out.println(img_url);
                ImageIcon icon = new ImageIcon(img_url);
                j1.setIcon(icon);
                hSplitPane.setRightComponent(j1);
            }
        });
        hSplitPane.setLeftComponent(list);
    }
}

