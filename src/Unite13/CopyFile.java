package Unite13;

import java.io.*;

/* 基础训练1 */
public class CopyFile {
    public static void main(String args[]){
        if(args.length < 2){
            System.out.println("usage:java CopyFile sourceFile targetFile");
            System.exit(0);
        }
        byte[] b = new byte[1024];
        try {
            FileInputStream inFile = new FileInputStream(args[0]);
            FileOutputStream targetFile = new FileOutputStream(args[1]);
            while (true){
                int byteRead = inFile.read(b);
                if(byteRead == -1){
                    break;
                }
                targetFile.write(b, 0, byteRead);
            }
            targetFile.close();
            System.out.println("copy success!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
