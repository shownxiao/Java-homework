package Unite4;
/* 样例调试综合样例1 */
import java.util.Scanner;
public class Ball {
    public static void main(String args[]){
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < a.length - 1; i++){
            for(int j = 0; j < a.length - i - 1; j++){
                if(a[j] > a[j + 1]){
                    int x = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = x;
                }
            }
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
