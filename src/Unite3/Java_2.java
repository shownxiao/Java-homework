package Unite3;
/* 编程练习2 */
import java.util.Scanner;
public class Java_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个长整数:");
        long n = sc.nextLong();
        int sum = 0;
        int count = 10;
        while (n * 10/ count > 0){
            if(n % count > 5){
                sum = sum + 1;
            }
            n = n / 10;
        }
        System.out.println("sum="+sum);
    }
}
