package Unite14;

/* 编程练习3 */
import java.util.*;
public class Java3 {
}


class Java3_Student{
    private String user[] = new String[10];
    private String tel[] = new String[10];

    public static void main(String args[]) {
        Java3_Student stu =  new Java3_Student();
        stu.init();
        stu.hashMap();
        stu.treeMap();
    }

    public void init() {
        StringBuffer tels = new StringBuffer();

        for(int i=0;i<10;i++) {
            user[i]="user"+(int)(Math.random()*10);
            for(int j=0;j<11;j++) {
                tels.append(""+(int)(Math.random()*10));
            }
            tel[i]=tels.toString();

            tels.delete(0, tels.length());
        }

        for(int i=0;i<10;i++) {
            System.out.println(tel[i]+" "+user[i]);
        }
    }

    public void hashMap() {
        HashMap<String,String> hash= new HashMap<String,String>();

        for(int i=0;i<10;i++) {
            hash.put(tel[i], user[i]);
        }

        System.out.println(hash.toString());
        System.out.println();
    }

    public void treeMap() {
        TreeMap<String,String> tree = new TreeMap<String,String>();

        for(int i=0;i<10;i++) {
            tree.put(tel[i], user[i]);
        }

        System.out.println(tree.toString());
    }
}
