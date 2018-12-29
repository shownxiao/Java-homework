package Unite8;
/* 编程练习2 */
public class Java_2 {
    public static void main(String args[]){
        Triangle t = new Triangle("三角形", 5, 4);
        t.count();
        Rectangle r = new Rectangle("矩形", 3, 8);
        r.count();
        Circle c = new Circle("圆形", 3);
        c.count();
    }
}
abstract class Shape {
    private String name;
    public Shape(String name){
        this.name = name;
    }
    public abstract void count();
    public String getName(){
        return this.name;
    }
}
class Triangle extends Shape {
    int bottom;
    int height;
    public Triangle(String n, int bottom, int height){
        super(n);
        this.bottom = bottom;
        this.height = height;
    }
    public void count(){
        System.out.println(this.getName()+"的面积是"+this.bottom*this.height/2);
    }
}
class Rectangle  extends Shape {
    int width;
    int height;
    public Rectangle(String n, int width, int height){
        super(n);
        this.width = width;
        this.height = height;
    }
    public void count(){
        System.out.println(this.getName()+"的面积是"+this.width*this.height);
    }
}
class Circle extends Shape {
    int radius;
    public Circle(String n, int radius){
        super(n);
        this.radius = radius;
    }
    public void count(){
        System.out.println(this.getName()+"的面积是"+this.radius*this.radius*Math.PI);
    }
}