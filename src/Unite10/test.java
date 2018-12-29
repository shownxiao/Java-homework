package Unite10;
import java.awt.*;
import java.applet.Applet;

/* 基础训练 */
public class test extends Applet {
    String str = "";
    public void init(){
        str = str + "->init()";
    }
    public void start(){
        str = str + "->start()";
    }
    public void paint(Graphics g){
        str = str + "->paint()";
        g.drawString(str, 50, 20);
    }
}
