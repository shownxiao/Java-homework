package Unite13;

import java.io.*;

/* 编程练习3 */
public class Java_3 {
    public static void main(String args[]) throws Exception{
       int[] intArray = new int[20];
       for (int i = 0; i < intArray.length; i++){
           intArray[i] = (int)(Math.random()*100);
       }
       int j;
       try {
           DataOutputStream out = new DataOutputStream(
                   new FileOutputStream("C:/Users/肖婴然/Desktop/13.data2.bat")
           );
           for(j = 0; j < intArray.length; j++){
               out.writeInt(intArray[j]);
           }
           out.close();
           System.out.println("bat文件的内容为");
           DataInputStream in = new DataInputStream(
                   new FileInputStream("C:/Users/肖婴然/Desktop/13.data2.bat")
           );
           while (in.available() != 0){
               j = in.readInt();
               System.out.print(j+" ");
           }
           in.close();
           RandomAccessFile fileW = new RandomAccessFile("C:/Users/肖婴然/Desktop/13.file2.txt", "rw");
           for(j = 0; j < intArray.length; j++){
                fileW.writeInt(intArray[j]);
           }
           fileW.close();
           long filePoint = 0;
           int s;
           System.out.println();
           System.out.println("txt文件的内容为");
           RandomAccessFile file = new RandomAccessFile("C:/Users/肖婴然/Desktop/13.file2.txt", "r");
           long fileLength = file.length();
           while (filePoint < fileLength){
               s = file.readInt();
               System.out.print(s+" ");
               filePoint = file.getFilePointer();
           }
           file.close();
       }catch (IOException e) {
           e.printStackTrace();
       }
    }
}
