package Unite14;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* 编程练习2 */
public class Java_2 {
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        int count = 0;
        try {
            DataInputStream in = new DataInputStream(new FileInputStream("C:/Users/肖婴然/Desktop/14.data1.txt"));
            while (in.available() != 0){
                String str = in.readLine();
                list.add(str);
                char c = str.charAt(0);
                if(c == 'a'){
                    count = count + 1;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        System.out.println("a的个数为:"+count);
    }
}
