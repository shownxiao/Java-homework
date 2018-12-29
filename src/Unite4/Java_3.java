package Unite4;
/* 编程练习3 */
public class Java_3 {
    public static void main(String args[]){
        int a[][] = new int[6][6];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = (int)((((float)(Math.random()*10)) % 2 + 1) * 10);
            }
        }
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int max = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++) {
                if (a[i][j] >= max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("最大值为"+max);
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++) {
                if (a[i][j] == max) {
                    System.out.println("最大值位于["+i+","+j+"]");
                }
            }
        }
        System.out.println("转置矩阵为");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
