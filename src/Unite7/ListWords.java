package Unite7;
/* 综合样例2 */
import java.util.Scanner;
public class ListWords {
    public static void main(String args[]){
        String line;
        char ch;
        StringBuffer wordList = new StringBuffer();
        boolean isWord = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行文本:");
        line = sc.nextLine();
        for(int i = 0; i < line.length(); i++){
            ch = line.charAt(i);
            if(Character.isLetter(ch)){
                wordList.append(ch);
                isWord = true;
            }
            else {
                if(isWord){
                    wordList.append(",");
                    isWord = false;
                }
            }
        }
        String x[] = wordList.toString().split(",");
        System.out.println("共有"+x.length+"个单词");
        for(int n = 0; n < x.length; n++){
            System.out.print(x[n]+" ");
        }
    }
}
