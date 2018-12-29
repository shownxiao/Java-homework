package Unite3;
/* 样例调试基础训练1 */
import java.util.Scanner;
public class Fxy {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x的值:");
        float x = sc.nextFloat();
        float y;
        if(x <= 0){
            y = 0;
        }
        else if (x < 5){
            y = 2 * x + 1;
        }
        else {
            y = x * x - 1;
        }
        System.out.println("y="+y);
    }
}
