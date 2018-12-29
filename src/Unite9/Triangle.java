package Unite9;
/* 综合样例 */
class NotTriangleException extends Exception {
    public String toString(){
        return "不能构成三角形";
    }
}
public class Triangle {
    double a, b, c;
    public Triangle(double a, double b, double c)throws NotTriangleException{
        if(a + b > c && a + c > b && b + c > a){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else
            throw new NotTriangleException();
    }
    public double area(){
        double p = (a + b + c)/2;
        return (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
    public static void main(String args[]){
        try {
            Triangle x = new Triangle(2, 3, 6);
            System.out.println(x.area());
        }catch (NotTriangleException e){
            System.out.println(e);
        }
    }
}
