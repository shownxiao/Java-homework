package Unite13;

import java.io.*;

/* 编程练习1 */
public class Java_1 {
    public static void main(String args[]){
        int[] intArray = {1, 2, 3, 4, 5};
        int j;
        try {
            DataOutputStream out = new DataOutputStream(
                    new FileOutputStream("C:/Users/肖婴然/Desktop/13.data1.bat")
            );
            for(j = 0; j < intArray.length; j++){
                out.writeInt(intArray[j]);
            }
            out.close();
            DataInputStream in = new DataInputStream(
                    new FileInputStream("C:/Users/肖婴然/Desktop/13.data1.bat")
            );
            while (in.available() != 0){
                j = in.readInt();
                System.out.println(j);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
