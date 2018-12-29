package Unite14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Vector;

/* 综合样例 */
public class Student {
    String name;
    long stno;
    String sex;
    public Student(String name, long stno, String sex){
        this.name = name;
        this.stno = stno;
        this.sex = sex;
    }
    public String toString(){
        return "姓名:" + name + ",学号:" + stno + ",性别=" + sex;
    }
    public static void main(String args[]){
        Vector<Student> group = new Vector<Student>();
        outer:while (true) {
            String ch = input("选择：1-增加，2-显示，3-退出");
            int choice = Integer.parseInt(ch);
            switch (choice){
                case 1:group.add(inputStudent());break ;
                case 2:
                    Iterator p = group.iterator();
                    while (p.hasNext()){
                        System.out.println("==>" + p.next());
                    }
                    break ;
                case 3:break outer;
            }
        }
    }
    public static String input(String hint){
        String x = null;
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        System.out.println(hint);
        try {
            x = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return x;
    }
    public static Student inputStudent(){
        String name = input("请输入姓名:");
        long stno = Long.parseLong(input("请输入学号:"));
        String sex = input("请输入性别:");
        return new Student(name, stno, sex);
    }
}
