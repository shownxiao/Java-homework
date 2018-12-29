package Unite7;
/* 编程练习2 */
import java.util.*;
public class Java_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段英文句子：");
        StringBuffer buf = new StringBuffer();
        String line = sc.nextLine();
        boolean isFirstWord = true;
        for(int i = 0; i < line.length(); i++){
            char ch = line.charAt(i);
            if(Character.isLetter(ch)){
                if(isFirstWord){
                    ch = Character.toUpperCase(ch);
                    isFirstWord = false;
                    buf.append(ch);
                }
                else {
                    buf.append(ch);
                }
            }
            else {
                buf.append(' ');
                isFirstWord = true;
            }
        }
        System.out.println(buf);
    }
}
