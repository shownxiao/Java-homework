package Unite6;
/* 综合样例1 */
public class trapezoid {
     private double upper;
     private double bottom;
     private double height;
     public trapezoid(double upper, double bottom, double height){
         this.upper = upper;
         this.bottom = bottom;
         this.height = height;
     }
     public double area(){
        return (upper + bottom)*height/2;
     }
     public static double area(trapezoid me){
        return (me.upper + me.bottom)*me.height/2;
     }
     public static double area(double upper, double bottom, double height){
        return (upper + bottom)*height/2;
     }
     public static void main(String args[]){
         trapezoid x = new trapezoid(2, 6, 3);
         System.out.println("面积1="+x.area());
         System.out.println("面积2="+area(new trapezoid(2, 8, 4)));
         System.out.println("面积3="+area(3, 8, 4));
     }
}
