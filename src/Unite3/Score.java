package Unite3;
/* 样例调试综合样例2 */

import java.util.*;
public class Score {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0, c = 0, d = 0, e = 0, f = 0;
        int sum = 0;
        while (a != -1){
            switch (a/10){
                case 0: case 1: case 2: case 3: case 4:
                case 5:
                    b++;break;
                case 6:
                    c++;break;
                case 7:
                    d++;break;
                case 8:
                    e++;break;
                case 9:
                case 10:
                    f++;break;
            }
            sum = sum + a;
            a = sc.nextInt();
        }
        int ava = (sum)/(b + c + d + e + f);
        System.out.println("不及格人数为:"+b);
        System.out.println("及格人数为:"+c);
        System.out.println("中等人数为:"+d);
        System.out.println("良好人数为:"+e);
        System.out.println("优秀人数为:"+f);
        System.out.println("平均分为:"+ava);
    }
}
