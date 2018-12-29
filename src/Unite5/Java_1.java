package Unite5;
/* 编程练习1 */
import javax.swing.*;

public class Java_1 {
    public static void main(String args[]){
        SimpleTime t = new SimpleTime(12, 30, 19);
        JOptionPane.showMessageDialog(null, t.buildString(), "\"this\"引用示范", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}

class SimpleTime {
    private int hour, minute, second;
    public SimpleTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String buildString(){
        return "this.toString():"+toString()+"\ntoString():"+toString()+"\nthis(with implicit toString() call:"+this;
    }
    public String toString(){
        return hour+":"+minute+":"+second;
    }
}