package Unite2;
/*第二章样例调试基础训练1*/
public class test1 {
    public static void main(String args[]){
        // int a = 20; 正确
        // int a = Math.random(); 错误，需要double类型
        // int a = (int)Math.random(); a始终为0
        int a = (int)(Math.random()*100); // 正确
        boolean b = true;
        double c = 3.14;
        char d = 'a';
        System.out.println(a + "," + b + "," + c + "," + d);
    }
}
