package Unite4;
/* 样例调试基础训练1 */
public class text1 {
    public static void main(String args[]){
        int x[] = new int[20];
        int sum = 0;
        for(int k = 0; k < x.length; k++){
            x[k] = 100 + (int)(Math.random()*900);
            System.out.println(x[k]);
            sum = sum + x[k];
        }
        System.out.println("ava="+(sum/x.length));
    }
}
