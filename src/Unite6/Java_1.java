package Unite6;
/* 编程练习1 */
public class Java_1 {
    int x, y;
    public Java_1(){}
    public Java_1(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Java_1(Java_1 p){

    }
    public Java_1 getLocation(){
        Java_1 p = new Java_1(x, y);
        return p;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public static void main(String args[]){
        Java_1 p = new Java_1(5, 5);
        System.out.println("x="+p.x+"y="+p.y);
        System.out.println("Location is" + p.getLocation());
    }
}
