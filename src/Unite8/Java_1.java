package Unite8;
/* 编程练习1 */
import java.text.*;
public class Java_1 {
    public static void main(String args[]){
        Person p = new Student("王甜甜", "计算机科学");
        System.out.println(p.getName()+","+p.getDescription());
    }
}
abstract class Person {
    public Person(String n){
        name = n;
    }
    public abstract String getDescription();
    public String getName(){
        return name;
    }
    private String name;
}
class Student extends Person {
    public Student(String n, String m){
        super(n);
        major = m;
    }
    public String getDescription(){
        return "学生的专业是:"+major;
    }
    private String major;
}
