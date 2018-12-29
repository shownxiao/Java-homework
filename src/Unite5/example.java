package Unite5;
/* 样例调试 */
class Example_Point{
    int x,y;
    public String toString(){
        return x+","+y;
    }
    public Example_Point(){
        this(10,10);
    }
    public Example_Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}

public class example {
    public  static void main(String args[]){
        Example_Point a=new Example_Point();
        System.out.println(a);

        Example_Point b=a;
        a.x=5;
        System.out.println(b);
        b=new Example_Point(8,3);
        System.out.println(b);
        b=null;
        System.out.println(b);
        Example_Point c[]={a,b};
        System.out.println(c[0]+","+c[1]);
        Example_Point d[]=new Example_Point[8];
        d[0]=a;
        d[1]=b;
        for(int k=0;k<c.length;k++)
            System.out.println(d[k]);
        d[6]=new Example_Point(4,6);
    }
}
