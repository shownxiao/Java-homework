package Unite7;
/* 综合样例1 */
public class Count {
    public static void main(String args[]){
        String s = args[0];
        if(count(s,'(') == count(s, ')')){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static int count(String s, char c){
        int x = 0;
        for(int k = 0; k < s.length(); k++){
            if(s.charAt(k) == c){
                x++;
            }
        }
        return x;
    }
}
