package Unite9;
/* 编程练习2 */
import java.util.*;
class NotNormalGrade extends Exception {
    public String toString(){
        return "输入格式错误！";
    }
}
class Student {
    String studentName;
    long studentId;
    int grade1;
    int grade2;
    int grade3;
    public Student(String studentName, long studentId, int grade1, int grade2, int grade3)throws NotNormalGrade{
        this.studentName = studentName;
        this.studentId = studentId;
        if(grade1 >= 0 && grade1 <= 100 && grade2 >= 0 && grade2 <= 100 && grade3 >= 0 && grade3 <= 100){
            this.grade1 = grade1;
            this.grade2 = grade2;
            this.grade3 = grade3;
        }
        else {
            System.out.println(this.studentName+"的成绩出了问题");
            throw new NotNormalGrade();
        }
    }
    public void print(){
        System.out.print(this.studentName + " " + this.studentId + " " + this.grade1 + " " + this.grade2 + " "+ this.grade3);
        System.out.println();
    }
    public void per_avarage(){
        System.out.println(this.studentName+"的平均分为"+(this.grade1+this.grade2+this.grade3)/3);
    }
}
public class Java_2 {
    public static void main(String args[]){
        // 方便调试，这里只输入第一个学生的成绩
        System.out.println("请输入第一个学生的姓名");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("请输入第一个学生的学号");
        long id = sc.nextLong();
        System.out.println("请输入第一个学生的成绩1");
        int g1 = sc.nextInt();
        System.out.println("请输入第一个学生的成绩2");
        int g2 = sc.nextInt();
        System.out.println("请输入第一个学生的成绩3");
        int g3 = sc.nextInt();
        try {
            Student s1 = new Student(name, id, g1, g2, g3);
            Student s2 = new Student("Anna", 902170501, 41, 98, 75);
            Student s3 = new Student("Jack", 902170502, 76, 35, 90);
            Student s4 = new Student("Marry", 902170503, 45, 87, 34);
            Student s5 = new Student("Shown", 902170504, 68, 98, 76);
            Student s6 = new Student("Like", 902170505, 89, 95, 53);
            Student s7 = new Student("Niko", 902170506, 65, 78, 90);
            Student s8 = new Student("Able", 902170507, 75, 97, 80);
            Student s9 = new Student("Care", 902170508, 85, 80, 89);
            Student s10 = new Student("Zoom", 902170509, 57, 43, 79);
            s1.print();
            s2.print();
            s3.print();
            s4.print();
            s5.print();
            s6.print();
            s7.print();
            s8.print();
            s9.print();
            s10.print();
            s1.per_avarage();
            s2.per_avarage();
            s3.per_avarage();
            s4.per_avarage();
            s5.per_avarage();
            s6.per_avarage();
            s7.per_avarage();
            s8.per_avarage();
            s9.per_avarage();
            s10.per_avarage();
            System.out.println("grade1的平均分为"+(s1.grade1+s2.grade1+s3.grade1+s4.grade1+s5.grade1+s6.grade1+s7.grade1+s8.grade1+s9.grade1+s10.grade1)/10);
            System.out.println("grade2的平均分为"+(s1.grade2+s2.grade2+s3.grade2+s4.grade2+s5.grade2+s6.grade2+s7.grade2+s8.grade2+s9.grade2+s10.grade2)/10);
            System.out.println("grade3的平均分为"+(s1.grade3+s2.grade3+s3.grade3+s4.grade3+s5.grade3+s6.grade3+s7.grade3+s8.grade3+s9.grade3+s10.grade3)/10);
        }catch (NotNormalGrade e){
            System.out.println(e);
        }

    }
}
