package Unite10;

import java.applet.Applet;
import java.awt.*;

/* 综合样例 */
public class prime extends Applet {
    private int a, b;
    public void init(){
        a = Integer.parseInt(getParameter("a"));
        b = Integer.parseInt(getParameter("b"));
    }
    public boolean isPrime(int n){
        for(int k = 2; k < n; k++){
            if(n % k == 0){
                return false;
            }
        }
        return true;
    }
    public void paint(Graphics g){
        int x = 50, y = 50;
        int m = 0;
        for(int i = a; i <= b; i++){
            if(isPrime(i)){
                g.drawString(""+i, x, y);
                m++;
                x = x + 40;
                if(m % 5 == 0){
                    x = 50;
                    y = y + 40;
                }
            }
        }
    }
}
