package Unite4;
/* 编程练习2 */
import java.util.Scanner;
public class Java_2 {
    public static void main(String args[]){
        int a[] = new int[100];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random()*100);
        }
        System.out.println("输入一个整数");
        int x = sc.nextInt();
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == x){
                count ++;
            }
        }
        System.out.println(x+"出现了"+count+"次");
    }
}
