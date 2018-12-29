package Unite14;

import java.util.ArrayList;
import java.util.List;

/* 编程练习1 */
public class Java_1 {
    public static String subStr(String str, int length){
        List<String> list = new ArrayList<String>();
        char c;
        for(int i = 0; i < str.length(); i++){
            c = str.charAt(i);
            if((int)c <= 255){
                list.add(c+" ");
            }
        }
        String s1, s2 = "";
        for (int k = 0; k < length; k++){
            if(k > list.size()){
                return s2;
            }
            s1 = list.get(k);
            s2 = s2.concat(s1);
        }
        return s2;
    }
    public static void main(String args[]){
        System.out.println(subStr("你好ABCD", 3));
    }
}
