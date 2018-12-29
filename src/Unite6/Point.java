package Unite6;

/* 编程练习2 */
public class Point {
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double distance(Point a){
        return Math.sqrt((a.x - this.x)*(a.x - this.x) + (a.y - this.y)*(a.x - this.x));
    }
    public static void main(String args[]){
        Point a = new Point(1, 2);
        Point b = new Point(2, 3);
        System.out.println(a.distance(b));
    }
}
