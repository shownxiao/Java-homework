package Unite6;
/* 编程练习3 */
class Person {
    String name;
    public void work(){
        System.out.println("正在工作"+this.name);
    }
}
class Football extends Person {
    public Football(){
        this.name = "踢球";
    }
}
class Singer extends Person {
    public Singer(){
        this.name = "唱歌";
    }
}
public class Java_3 {
    public static void main(String args[]){
        Football x = new Football();
        Singer y = new Singer();
        x.work();
        y.work();
    }
}
