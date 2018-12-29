package Unite7;
/* 编程练习1 */
import javax.swing.*;
public class Java_1 {
    public static void main(String args[]){
        StringBuffer buf = new StringBuffer("你好！祝你成功！");
        String output = "buf=" + buf.toString() + "\nCharacter at 0:" + buf.charAt(0) + "\nCharacter at 4:" + buf.charAt(4);
        char charArray[] = new char[buf.length()];
        buf.getChars(0, buf.length(), charArray, 0);
        output += "\n\n在字符串缓存中的字符是:";
        for(int i = 0; i < charArray.length; i++){
            output = output + charArray[i];
        }
        buf.setCharAt(6, '材');
        output += "\n\nbuf=" + buf.toString();
        buf.reverse();
        output += "\n\nbuf=" + buf.toString();
        JOptionPane.showMessageDialog(null, output, "字符串缓存的字符相关方法示范", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
