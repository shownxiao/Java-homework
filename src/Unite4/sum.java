package Unite4;
/* 样例调试综合样例1 */
public class sum {
    public static void main(String args[]){
        int a[][] = new int[4][4];
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = (int)(Math.random()*10);
            }
        }
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(i == 0 || i == 3 || j == 0 || j == 3){
                    sum = sum + a[i][j];
                }
            }
        }
        System.out.println("sum="+sum);
        int pos = 0;
        int max = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i][i] > max){
                max = a[i][i];
                pos = i;
            }
        }
        System.out.println("最大元素位置位于[" + pos + "," + pos + "]");
    }
}
