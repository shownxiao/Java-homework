package Unite2;

/*样例调试综合样例1*/
public class test {
    public static void main(String args[]){
        int m = 0;
        System.out.println("m++="+ m++);
        System.out.println("++m" + (++m));
        boolean x;
        x = (5 > 3) && (4 == 6);
        System.out.println("x=" + x);
        m = m % 2;
        System.out.println("result=" + m + 1);
        int y = m*m + 2*m + 1;
        System.out.println("m=" + m + ",y=" + y);
    }
}
