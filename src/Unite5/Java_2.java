package Unite5;
/* 编程练习1 */
public class Java_2 {
    public static void main(String args[]){
        Point a[] = new Point[10];
        int b[] = new int[10];
        for(int i = 0; i < a.length; i++){
            a[i] = new Point((int)(Math.random()*10), (int)(Math.random()*10));
            b[i] = a[i].distance();
        }
        for(int i = 0; i < b.length - 1; i++){
            for(int j = 0; j < b.length - i - 1; j++){
                if(b[j] > b[j + 1]){
                    int x = b[j + 1];
                    b[j + 1] = b[j];
                    b[j] = x;
                    Point node = new Point(a[j + 1].x, a[j + 1].y);
                    a[j + 1].x = a[j].x;
                    a[j + 1].y = a[j].y;
                    a[j].x = node.x;
                    a[j].y = node.y;
                }
            }
        }
        for(int i = 0; i < b.length; i++){
            System.out.print("["+a[i].x+","+a[i].y+"]"+" ");
            System.out.println(b[i]);
        }
    }


}

class Point {
     public int x, y;
     public Point(int x, int y){
         this.x = x;
         this.y = y;
     }
     public int distance(){
         return ((this.x * this.x) + (this.y * this.y));
     }
}