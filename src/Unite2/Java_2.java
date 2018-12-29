package Unite2;
/*编程练习1*/
import java.util.Scanner;
public class Java_2 {
    static public void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆柱体的高和半径:");
        float height = sc.nextFloat();
        float radius = sc.nextFloat();
        System.out.println("圆柱体的体积为:"+(3.14 * height * radius * radius));
    }
}
