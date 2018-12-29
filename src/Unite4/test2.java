package Unite4;
/* 样例调试基础训练2 */
public class test2 {
    private static int comm(int x, int y){
        for(int k = Math.min(x, y); k > 1; k--){
            if(x % k == 0 && y % k == 0){
                return k;
            }
        }
        return 1;
    }
    public static void main(String args[]){
        System.out.println(comm(24, 78));
        System.out.println(comm(6, 9));
    }
}
