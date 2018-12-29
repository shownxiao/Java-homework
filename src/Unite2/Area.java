package Unite2;
import javax.swing.*;
/*样例调试综合样例2*/
public class Area {
    public static void main(String args[]){
        String str = JOptionPane.showInputDialog("请输入梯形的上底:");
        double x = Double.parseDouble(str);
        str = JOptionPane.showInputDialog("请输入梯形的下底:");
        double y = Double.parseDouble(str);
        str = JOptionPane.showInputDialog("请输入梯形的高:");
        double z = Double.parseDouble(str);
        double s = (x + y) * z / 2;
        JOptionPane.showMessageDialog(null, "面积=" + s);
    }
}
