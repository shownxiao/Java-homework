package Unite13;

import java.io.RandomAccessFile;

/* 编程练习2 */
public class Java_2 {
    public static void main(String args[]) throws Exception {
        long filePoint = 0;
        String s;
        RandomAccessFile file = new RandomAccessFile("C:/Users/肖婴然/Desktop/13.file1.txt", "r");
        long fileLength = file.length();
        while (filePoint < fileLength){
            s = file.readLine();
            System.out.println(s);
            filePoint = file.getFilePointer();
        }
        file.close();
    }
}
