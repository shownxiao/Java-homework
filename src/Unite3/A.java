package Unite3;
/* 样例调试综合样例1 */
public class A {
    public static void main(String args[]){
        int k = 10;
        int m = 0;
        while (k <= 100){
            if(k % 3 == 0 || k % 5 == 0){
                m = m + 1;
                System.out.print(k + " ");
                if(m % 5 == 0){
                    System.out.println();
                }
            }
            k = k + 1;
        }
    }
}
