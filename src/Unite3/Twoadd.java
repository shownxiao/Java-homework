package Unite3;
/* 样例调试基础训练2 */
import java.util.Scanner;
public class Twoadd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n的值:");
        int n = sc.nextInt();
        int sum = 1;
        int count = 1;
        for(int i = 1; i <= n; i++){
            count = 2*count;
            sum = sum + count;
        }
        System.out.println("sum="+sum);
    }
}
